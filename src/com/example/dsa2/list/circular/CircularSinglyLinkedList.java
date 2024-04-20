package com.example.dsa2.list.circular;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private CListNode last;
    private int length;

    private class CListNode{
        private CListNode next;
        private int data;

        public CListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        CListNode first = new CListNode(1);
        CListNode second = new CListNode(5);
        CListNode third = new CListNode(10);
        CListNode fourth = new CListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display(){
        if(last == null){
            return;
        }
        CListNode first = last.next;
        while (first != last){
            System.out.print(first.data + "->");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public void insertFirst(int data){
        CListNode newNode = new CListNode(data);
        if(last == null){
            last = newNode;
        }else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertLast(int data){
        CListNode newNode = new CListNode(data);
        if(last == null){
            last = newNode;
            last.next = last;
        }else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public int removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Circular singly list is empty");
        }
        CListNode temp = last.next;
        int result = temp.data;
        if(last.next == last){
            last = null;
        }else {
            last.next = temp.next;
        }
        //temp.next = null;
        length--;
        return result;
    }


    public static void main(String[] args) {
        CircularSinglyLinkedList cl = new CircularSinglyLinkedList();
        cl.createCircularLinkedList();

        cl.insertFirst(18);

        cl.insertLast(20);

        System.out.println(cl.removeFirst());

        cl.display();

    }
}

