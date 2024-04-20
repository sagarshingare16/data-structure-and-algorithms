package com.example.dsa2.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){      //-i to reduce iterating over sorted elements.
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {58,14,98,-3,0,100,-43};
        System.out.println("Unsorted Array: "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.print("Sorted Array: "+Arrays.toString(arr));
    }
}
