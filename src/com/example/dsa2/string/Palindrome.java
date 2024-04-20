package com.example.dsa2.string;

public class Palindrome {

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while (start<end){
            if (str.charAt(start) == str.charAt(end)){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean result = isPalindrome("Hello".toLowerCase());
        System.out.println(result);
    }
}
