package com.binarysearch.problems;

public class FindNumberInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        System.out.println(searchNumber(arr, target));
    }

    static int searchNumber(int[] arr, int target) {

        int[] index=  lengthOfArray(arr,target);
        int start = index[0];
        int end =index[1];

        while(start<=end){
            int mid = start - (start-end)/2;

            if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                if (arr[mid] == target) {
                    return mid;
                }
            }
        }
        return -1;
    }

    static int[] lengthOfArray(int[] arr, int target){
        int start = 0;
        int[] ans = {-1, -1};
        int end = 1;
        while(arr[end] < target){
            int newS = end+1;
            end = end + (end - start +1)*2;
            start = newS;
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
}
