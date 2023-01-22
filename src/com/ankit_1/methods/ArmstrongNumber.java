package com.ankit_1.methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Number for checknig Armstrong:");
        int val = in.nextInt();
        boolean flag = isArmastrong(val);
        System.out.println(flag);
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
