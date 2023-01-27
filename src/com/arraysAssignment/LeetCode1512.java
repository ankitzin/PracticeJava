package com.arraysAssignment;

public class LeetCode1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        System.out.println(goodPairs(nums));
    }

    static int goodPairs(int[] nums) {
            int ans = 0;
            int[] temp = new int[101];

            for (int i = 0; i < nums.length; i++) {
                ans += temp[nums[i]]++;
            }
            return ans;
        }
}
