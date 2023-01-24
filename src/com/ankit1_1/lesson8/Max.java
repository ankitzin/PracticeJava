package com.ankit1_1.lesson8;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,4,5,6};
        int result = maxMethod(arr, arr.length);
        System.out.println(result);
    }

    private static int maxMethod(int[] arr, int len) {
        int maxVal = arr[0];
        for (int i = 0; i < len; i++) {
            if(arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
