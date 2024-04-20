package com.example.dsa2.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveInteger {

    public static int[] removeEven(int[] arr){
        int oddCount = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                result[idx] = i;
                idx++;
            }
        }
        return  result;

    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,18,6,19,23};
        int[] evenArray  = removeEven(arr);
        System.out.println(Arrays.toString(evenArray));

        IntStream evenArray1 = Arrays.stream(arr)
                .filter(value -> value%2 !=0);
        System.out.println(Arrays.toString(evenArray1.toArray()));

    }
}
