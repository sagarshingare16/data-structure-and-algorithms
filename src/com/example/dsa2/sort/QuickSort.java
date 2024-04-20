package com.example.dsa2.sort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);   //left
            quickSort(arr,p+1,high);  //right
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low;
        int j = low;
        while (i<=high){
            if(arr[i] <= pivot){
                int temp = arr[i];   //this will push smaller elements to left
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }

    public static void main(String[] args) {
        int[] arr = {8,-3,5,2,6,9,-6,1,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
