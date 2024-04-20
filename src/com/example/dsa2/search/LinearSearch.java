package com.example.dsa2.search;

public class LinearSearch {

    public static int linearSearch(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,77,1};
        int result = linearSearch(arr,77);
        System.out.println("Element found at index: "+ result);
    }
}
