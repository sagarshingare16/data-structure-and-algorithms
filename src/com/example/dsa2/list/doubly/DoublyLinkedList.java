package com.example.dsa2.list.doubly;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private DListNode head;
    private DListNode tail;
    private int length;


    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return  length == 0;
    }

    public int length(){
        return length;
    }

    public void insertFirst(int value){
        DListNode newNode = new DListNode(value);
        if(isEmpty()){
            tail = newNode;
        }else {
            head.previous = newNode;
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    public void insertLast(int value){
        DListNode newNode = new DListNode(value);
        if(isEmpty()){
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void displayForward(){
        if(head == null){
            return;
        }
        DListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void displayBackward(){
        if(tail == null){
            return;
        }
        DListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.previous;
        }
        System.out.println("Null");
    }

    public DListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        DListNode temp = head;
        if(head == tail){
            tail = null;
        }else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public DListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        DListNode temp = tail;
        if(head == tail){
            head = null;
        }else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertLast(1);
        dl.insertLast(10);
        dl.insertLast(15);

        dl.displayForward();

        dl.deleteFirst();

        dl.deleteLast();

        dl.displayForward();

    }
}
