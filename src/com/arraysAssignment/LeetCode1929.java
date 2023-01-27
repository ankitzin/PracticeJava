package com.arraysAssignment;

import java.util.Arrays;

/*
* Input: nums = [1,2,1]
* Output: [1,2,1,1,2,1]
* Explanation: The array ans is formed as follows:
* - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
* - ans = [1,2,1,1,2,1]
* */
public class LeetCode1929 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(doubleArray(nums)));
    }

    private static int[] doubleArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len*2];
        ans[0] = nums[0];
        ans[len]=nums[0];
        for(int i = 1; i<len;i++){
            ans[i] = nums[i];
            ans[len+i] = nums[i];
        }
        return ans;
    }

}
