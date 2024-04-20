package com.example.dsa2.search;

public class BinarySearch {

    public static int binarySearch(int[] arr ,int value){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (high + low)/2;
            if(arr[mid] == value){
                return mid;
            }else if (value < arr[mid]) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,20,47,59,65,75,88,99};
        int result= binarySearch(arr,100);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found in given array");
        }
    }
}
