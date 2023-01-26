package com.linearsearch;

import java.util.Arrays;

public class RichestManWealth {
    public static void main(String[] args) {
        int[][] val2d = {
                {1,2,3},
                {3,2,1},
                {3,2,4}
        };

        System.out.println(findRichPerson(val2d));
    }

    private static int findRichPerson(int[][] val2d) {
        int max = Integer.MIN_VALUE;
        for(int[] row1: val2d){
//            int sum = Arrays.stream(row1).sum();
            int sum =0;
            for(int val: row1){
                sum += val;
            }
            if(max < sum){
                max = sum; //6
            }
        }
        return max;
    }


}
