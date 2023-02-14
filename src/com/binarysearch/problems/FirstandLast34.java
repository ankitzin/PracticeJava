package com.binarysearch.problems;

import java.util.Arrays;

public class FirstandLast34 {
    public static void main(String[] args) {
        int[] nums = {2,7,7,7,9,10,11};
        int target = 7;
        System.out.println(Arrays.toString(firstandlast(nums, target)));
    }

    private static int[] firstandlast(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = searchVal(nums, target, true);
        int end = searchVal(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private static int searchVal(int[] nums, int target, boolean startFlag) {
        int ans = -1;
        int end = nums.length -1;
        int start = 0;
        while(start<=end){
            int mid = start - (start-end)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if (target> nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(startFlag){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
