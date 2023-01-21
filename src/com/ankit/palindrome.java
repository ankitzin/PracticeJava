package com.ankit;

public class palindrome {
    public static void main(String[] args) {
        long val = 1123443211;
        long result=0;
        long rem = 0, count=0;
        long temp = val;
        while(val>0) {
            rem = val % 10;
            val = val / 10;
            result = result * 10 + rem;
        }
        if(temp==result) {
            System.out.println("palindrome.");
        }else{
            System.out.println("not palindrome.");
        }

    }
}
