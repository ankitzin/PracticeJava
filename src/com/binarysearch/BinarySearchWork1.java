package com.binarysearch;

public class BinarySearchWork1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 7;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start - (start + end)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
