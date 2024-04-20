package com.example.dsa2.queue;

public class MaxPQ {
    private Integer[] heap;
    private int n;  // size of max heap

    public MaxPQ(int capacity){
        heap = new Integer[capacity +1];
        n= 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public void insert(int value){
        if(n == heap.length -1){
           resize(2*heap.length);
        }
        n++;
        heap[n] = value;
        swim(n);
    }

    private void swim(int idx){
        while (idx>1 && heap[idx/2]<heap[idx]){
            int temp = heap[idx];
            heap[idx] = heap[idx/2];
            heap[idx/2] = temp;
            idx = idx/2;   //bcoz we need to continue shifting up till new value inserted is at correct position
        }
    }

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for (int i=0;i< heap.length;i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void printMaxHeap(){
        for(int i = 1;i<=n;i++){
            System.out.print(heap[i]+ " ");
        }
    }



    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(3);

        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);

        pq.printMaxHeap();

    }
}
