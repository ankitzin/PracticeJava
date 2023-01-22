package com.ankit_1.methods;

import java.util.Arrays;

public class PassByReferenceComplex {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        changenums(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void changenums(int[] nums) {
        nums[0] = 100;
    }
}
