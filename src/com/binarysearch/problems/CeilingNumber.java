package com.binarysearch.problems;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,24,26,34,45,67};
        int target = 26;
        System.out.println(findNumber(arr,target));
    }

    private static int findNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
