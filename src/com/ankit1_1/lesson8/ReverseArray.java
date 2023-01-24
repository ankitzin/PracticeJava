package com.ankit1_1.lesson8;
import com.ankit1_1.lesson8.Swap;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i =0;
        int j = arr.length;
        while( i < j) {
            Swap.swapFunc(arr, i, j-1);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
