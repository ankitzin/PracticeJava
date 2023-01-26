package com.linearsearch;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,34,23,11,15,16,17,10};
        int[] arr1 = {};

        System.out.println(Arrays.toString(arr));
        System.out.println(findMinumum(arr));;
    }

    static int findMinumum(int[] arr){

        if(arr.length < 2){
            return -1;
        }
        int min = arr[0];
        for(int val:arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
}
