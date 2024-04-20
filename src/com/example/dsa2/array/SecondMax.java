package com.example.dsa2.array;

public class SecondMax {

    public static int findSecondMax(int[] arr){
        int max =  0;
        int secondMax = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {2,11,5,10,7,8,-1};
        int result = findSecondMax(arr);
        System.out.println(result);
    }
}
