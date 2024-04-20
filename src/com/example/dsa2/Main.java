package com.example.dsa2;

public class Main {

    public static int findSum1(int n){
        return (n+1)/2;
    }

    public static int findSum2(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum =sum+1;
        }
        return sum;
    }
    public static void main(String[] args) {

        long startSequence = System.currentTimeMillis();
        int result =findSum1(10000000);
        long endSequence = System.currentTimeMillis();
        System.out.println(result + " " +(endSequence-startSequence));


        long startSequence2 = System.currentTimeMillis();
        int result2 =findSum2(10000000);
        long endSequence2 = System.currentTimeMillis();
        System.out.println(result + " " +(endSequence2-startSequence2));
    }
}