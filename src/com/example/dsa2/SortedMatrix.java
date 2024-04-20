package com.example.dsa2;

public class SortedMatrix {

    public void search(int[][] matrix, int n,int k){
        int i = 0;
        int j = n-1;

        while (i<n && j>=0){
            if(matrix[i][j] == k){
                System.out.println("Value found at index "+i+","+j);
                return;
            }
            if(matrix[i][j] > k){
                j--;
            }else {
                i++;
            }
        }
        System.out.println("Value not found.");
    }

    public static void main(String[] args) {

        SortedMatrix smt = new SortedMatrix();

        int[][] matrix = {
                {10,20,30,43},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,51}
        };
        smt.search(matrix,matrix.length,100);
    }
}
