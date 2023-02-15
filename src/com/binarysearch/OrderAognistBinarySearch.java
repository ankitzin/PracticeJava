package com.binarysearch;

public class OrderAognistBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {7,6,5,4,3,2,1};
        int target = 2;
        System.out.println(binaryOrderAognistic(arr1,target));
    }
    private static int binaryOrderAognistic(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = false;
        int ans = -1;

        if(arr[0]< arr[end]){
            isAsc = true;
        }
        while(start <= end){
            int mid = start - (start-end)/2;

            if(arr[mid]==target){
                ans = mid;
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
