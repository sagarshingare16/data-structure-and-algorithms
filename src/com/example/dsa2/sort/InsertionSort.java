package com.example.dsa2.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 1;i<arr.length;i++){  // unsorted part
            int temp = arr[i];
            int j = i-1;           // sorted part
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {58,14,98,-3,0,100,-43};
        System.out.println("Unsorted Array: "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
