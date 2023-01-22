package com.ankit_1.methods;

import java.util.Scanner;

public class Method_first {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2:");
        int num2 = in.nextInt();
        int ans = num2+num1;
        System.out.println("The Ans is :"+ans);
    }
}
