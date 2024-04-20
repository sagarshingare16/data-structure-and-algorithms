package com.example.dsa2.string;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c :chars){
            stack.push(c);
        }
        for (int i = 0; i<str.length(); i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    /*public static String reverseString(String str){
        String result = "";
        char[] chars = str.toCharArray();
        for (char c : chars){
            result = c + result;
        }
        return result;
    }*/

    /*public static void reverseString(String str){
        char[] chars = str.toCharArray();
        for (int i=str.length()-1;i>=0;i--){
           System.out.print(chars[i]);
        }
    }*/

    public static void main(String[] args) {
        String result = reverseString("Hello and welcome");
        System.out.println(result);
    }
}
