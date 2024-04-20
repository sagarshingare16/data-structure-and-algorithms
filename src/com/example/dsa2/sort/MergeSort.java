package com.example.dsa2.sort;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr,int[] tmp,int l,int r){
        if(l<r){   //base condition
            int mid = l + (r-l)/2;  // overflow condition cross integer range
            sort(arr,tmp,l,mid);
            sort(arr,tmp,mid+1,r);
            merge(arr,tmp,l,mid,r);
        }
    }

    public static void merge(int[] arr, int[] tmp, int l,int mid,int r){
        for (int i=l;i<=r;i++){
            tmp[i] = arr[i];        //copy into tmp;
        }

        int i = l;    //traverse left sorted array
        int j = mid+1; // traverse right sorted array
        int k = l;    // merge both arrays into original array

        while (i<=mid && j<=r){
            if(tmp[i] < tmp[j]){
                arr[k] = arr[i];
                i++;
            }else {
                arr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            arr[k] = tmp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr =  {9,52,4,3};
        sort(arr, new int[arr.length],0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
