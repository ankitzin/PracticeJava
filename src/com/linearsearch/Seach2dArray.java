package com.linearsearch;

import java.util.Arrays;
import java.util.List;

public class Seach2dArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 9;
        System.out.println(search2d(arr2d,target));

    }
    static List<Integer> search2d(int[][] arr2d, int target){
        int i=0;
        for(int[] arr: arr2d){
            int j=0;
            for(int val : arr){
                if(val==target){
                    return Arrays.asList(i,j);
                }
                j++;
            }
            i++;
        }
        return Arrays.asList(-1,-1);
    }
}
