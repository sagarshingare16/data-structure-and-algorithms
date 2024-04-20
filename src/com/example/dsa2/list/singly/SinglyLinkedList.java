package com.example.dsa2.list.singly;

public class SinglyLinkedList {
    private static ListNode head;

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int value,int pos){
        ListNode newNode = new ListNode(value);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }else {
            ListNode previous = head;
            int count = 1;  //position - 1
            while (count < pos-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void deleteAtPosition(int pos){
        if(pos == 1){
            head = head.next;
        }else {
            ListNode previous = head;
            int count = 1;
            while (count<pos-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean searchElement(int key){
        ListNode current = head;
        while (current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMidNode(){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && slowPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode getNthFromLast(int pos){
        if(head == null){
            return null;
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < pos){
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public void insertInSortedList(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            return;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }

    public void removeElement(int value){
        ListNode current = head;
        ListNode temp = null;

        if(current != null && current.data == value){
            head = current.next;
            return;
        }
        while (current != null && current.data != value){
            temp = current;
            current = current.next;
        }

        if(current == null){
            return;
        }
        temp.next = current.next;
    }

    public boolean detectLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    public void createLoop(){
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public ListNode startNodeInList(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    public ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while (temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;  // starting node of the loop
    }

    public void removeLoopNode() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                removeLoop(slowPtr);
            }
        }
    }
    public void removeLoop(ListNode slowPtr){
        ListNode temp = head;
        while (temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }


    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null){
            if(a.data < b.data){
                tail.next = a;
                a = a.next;
            }else {
                tail.next = b;
                b  = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        }else {
            tail.next = a;
        }
        return dummy.next;
    }



    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        /*singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        //connect nodes together to form chain

        singlyLinkedList.head.next = second; //10 -->20
        second.next = third;            //10-->20-->30
        third.next = fourth;    //10-->20-->30-->40-->null

        singlyLinkedList.display();

        System.out.println("Length: "+singlyLinkedList.length());*/

       /* singlyLinkedList.insertFirst(16);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertFirst(8);
        singlyLinkedList.insertFirst(1);*/

       /* singlyLinkedList.insertLast(15);
        singlyLinkedList.insertFirst(89);
        singlyLinkedList.insertLast(54);*/

       /* singlyLinkedList.insertAtPosition(55,4);

        System.out.println(singlyLinkedList.deleteFirst());

        System.out.println(singlyLinkedList.deleteLast());

        singlyLinkedList.deleteAtPosition(3);

        System.out.println("Element found: "+singlyLinkedList.searchElement(11));

        System.out.println(singlyLinkedList.reverse(head));

        System.out.println(singlyLinkedList.getMidNode().data);

        System.out.println(singlyLinkedList.getNthFromLast(2).data);*/

       /* singlyLinkedList.insertInSortedList(11);

        singlyLinkedList.removeElement(11);*/

       /* singlyLinkedList.createLoop();
        System.out.println(singlyLinkedList.detectLoop());
        System.out.println(singlyLinkedList.startNodeInList().data);

        singlyLinkedList.removeLoopNode();*/

        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insertFirst(1);
        sl1.insertFirst(4);
        sl1.insertFirst(8);

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl1.insertFirst(3);
        sl1.insertFirst(5);
        sl1.insertFirst(7);
        sl1.insertFirst(9);
        sl1.insertFirst(14);

        SinglyLinkedList result = new SinglyLinkedList();
        result.merge(sl1.head,sl2.head);

        result.display();

       // singlyLinkedList.display();

    }
}


