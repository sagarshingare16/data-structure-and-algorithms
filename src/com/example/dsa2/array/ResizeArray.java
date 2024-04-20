package com.example.dsa2.array;

import java.util.Arrays;

public class ResizeArray {

    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i=0;i<arr.length;i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,11,5,10,7,8,-1};
        int[] result = resize(arr,arr.length*2);

        result[7] = 48;
        System.out.println(Arrays.toString(result));
    }
}
