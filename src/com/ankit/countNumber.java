package com.ankit;

import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        int newArr[];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        newArr = new int[n];
        for(int i=0;i<n;i++){
            newArr[i] = i;
        }
        int search = in.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(search == newArr[i]){
                count++;
            }else{
                continue;
            }
        }
    }
}
