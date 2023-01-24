package com.linearsearch;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int search = in.nextInt();
        int i =0;
        for(int val: arr){
            if(val == search){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
