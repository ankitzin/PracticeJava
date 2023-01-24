package com.ankit1_1.lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr.get(row).add(in.nextInt());
            }
        }
        System.out.println(arr);
    }


}
