package com.ankit_1.methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i =100;i < 1000;i++){
            boolean flag = isArmastrong(i);
            if(flag){
                System.out.println(i+" ");
            }
        }
    }

    static boolean isArmastrong(int val) {
//        int rem = 0;
        int res = 0;
        int temp = val;
        while(temp>0){
            int rem = temp % 10;
            temp = temp / 10;
            res += rem*rem*rem;
        }

        return res == val;
    }
}
