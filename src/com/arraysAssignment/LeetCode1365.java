package com.arraysAssignment;

import java.util.Arrays;

public class LeetCode1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] nums1 = {7,7,7,7};
        System.out.println(Arrays.toString(findSmallerWithItself(nums)));
        System.out.println(Arrays.toString(findSmallerWithItself(nums1)));
    }

    private static int[] findSmallerWithItself(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
