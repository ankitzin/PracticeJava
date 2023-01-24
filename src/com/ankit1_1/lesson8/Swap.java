package com.ankit1_1.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        swapFunc(arr, 0, 5);

        System.out.println(Arrays.toString(arr));
    }

    static void swapFunc(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
