package com.example.dsa2.array;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,11,5,10,7,8};

        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
