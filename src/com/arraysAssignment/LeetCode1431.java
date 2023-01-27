package com.arraysAssignment;
/*
* Input: candies = [2,3,5,1,3], extraCandies = 3
* Output: [true,true,true,false,true]
* */

import java.util.*;


public class LeetCode1431 {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(candiesFinder(candies, extraCandies));
    }

    static List<Boolean> candiesFinder(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        int max = findMax(candies);

        for(int i =0;i<candies.length;i++){
            int val = candies[i]+ extraCandies;
            ans.add(isValid(val,max));
        }
        return ans;
    }
    static boolean isValid(int val, int max){
        return val>=max;
    }

    static int findMax(int[] candies){
        int max = 0;
        for(int val: candies){
            if(max<val){
                max = val;
            }
        }
        return max;
    }
}
