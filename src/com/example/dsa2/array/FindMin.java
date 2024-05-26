package com.example.dsa2.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMin {

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {2,11,5,10,7,8,-1};
        int result = findMin(arr);
        System.out.println(result);

        IntStream finalResult = Arrays.stream(arr)
                .filter(value -> {
                    int min = 0;
                    return value < min;
                });
        System.out.println(Arrays.toString(finalResult.toArray()));
    }
}
