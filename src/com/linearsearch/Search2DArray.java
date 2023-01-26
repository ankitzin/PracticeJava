package com.linearsearch;

import java.util.Arrays;
import java.util.List;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        int target = 9;
        System.out.println(search2d(arr2d,target));
        System.out.println(findMax(arr2d));
        System.out.println(findMin(arr2d));

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

    static int findMax(int[][] arr2d){
        int max = Integer.MIN_VALUE;
        for(int[] arr: arr2d){
            for(int val : arr){
                if(val>max) {
                    max = val;
                }
            }
        }
        return max;
    }

    static int findMin(int[][] arr2d){
        int min = Integer.MAX_VALUE;
        for(int[] arr: arr2d){
            for(int val : arr){
                if(val<min) {
                    min = val;
                }
            }
        }
        return min;
    }

}
