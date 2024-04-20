package com.example.dsa2.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int minIndex = i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {58,14,98,-3,0,100,-43};
        System.out.println("Unsorted Array: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
