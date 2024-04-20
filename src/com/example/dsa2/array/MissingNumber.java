package com.example.dsa2.array;

import java.util.Arrays;

public class MissingNumber {

    public static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }
    public static int findMissingPositiveInteger(int[] arr){
        Arrays.sort(arr);
        int result = 1;
        for (int i : arr) {
            if (i == result)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,11,5,10,7,8,1};
        int result = findMissingNumber(arr);
        int result1 = findMissingPositiveInteger(arr);

        System.out.println(result);
        System.out.println(result1);
    }
}
