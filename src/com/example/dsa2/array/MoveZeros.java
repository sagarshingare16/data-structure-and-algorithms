package com.example.dsa2.array;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,8,0,5,19,0,59,0,0,-1};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
