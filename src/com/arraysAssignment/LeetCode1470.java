package com.arraysAssignment;

import java.util.Arrays;

/*
* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
* Return the array in the form [x1,y1,x2,y2,...,xn,yn].
* Input: nums = [2,5,1,3,4,7], n = 3
* Output: [2,3,5,4,1,7]
* */
public class LeetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(suffleArray(nums, n)));
    }

    static int[] suffleArray(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for(int i=0,j=n,k=0; i< n && j<nums.length; i++,j++,k+=2){
            ans[k] = nums[i];
            ans[k+1] = nums[j];
        }
        return ans;
    }
}
