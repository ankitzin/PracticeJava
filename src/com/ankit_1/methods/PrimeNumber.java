package com.ankit_1.methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Number:");
        int val = in.nextInt();
        boolean flag = prime(val);
        System.out.println(flag);
    }

    private static boolean prime(int val) {
        if(val<1){
            return false;
        }
        int c = 2;
        while(c*c <= val){
            if(val%c == 0){
                return false;
            }
            c += 1;
        }
        return c*c >val ;
    }
}
