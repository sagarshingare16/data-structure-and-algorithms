package com.example.dsa2.sort;

import java.util.Arrays;

public class ThreeNumbersSort {

    public static void threeNumberSort(int[] arr){
        int i = 0;   //for 1
        int j = 0;   // 0
        int k = arr.length - 1;  // for 2

        while (i<=k){
            if(arr[i] == 0){
                swap(arr,i ,j);
                i++;
                j++;
            } else if (arr[i] == 1){
                i++;
            } else if (arr[i] == 2){
                swap(arr,i,k);
                k--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,0,0,0,1,2,1,1,0,0,2,2,1,2,2,1};
        threeNumberSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
