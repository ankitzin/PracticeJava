package com.ankit;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int val = in.nextInt();
        int count = 0;
        do{
            long rem = num%10;
            if(rem == (int) val){
                count++;
                num = num/10;
            }else{
                num = num/10;
            }
        }while(num>10);

        System.out.println(count);
    }
}
