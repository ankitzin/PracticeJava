package com.ankit;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        int n = 0;
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        int fibarr[];
        fibarr = new int[j];
        for(int i = 0;i < j; i++){
            fibarr[i] = i;
        }

        for(int i=0;i < j-2; i++){
            fibarr[i+2] = fibarr[i] + fibarr[i+1];
        }

        String stringArr = Arrays.toString(fibarr);
        System.out.println(stringArr);
    }
}
