package com.example.dsa2.sort;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0; int j = 0; int k = 0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            }else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length){   // this condition if arr1 completed first and there are leftover elements in arr2
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){  // this condition if arr2 completed first and there are leftover elements in arr1
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {5,15,25,35,45,55,65};
        int[] result = mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}
