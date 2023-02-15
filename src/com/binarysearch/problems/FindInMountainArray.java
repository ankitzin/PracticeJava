package com.binarysearch.problems;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,7,5,6};
        int target = 6;
        System.out.println(search(arr, target));
    }
    private static int search(int[] arr, int target){
        int peak = findPeakMountain(arr);
        int isFind = binaryOrderAgnostic(arr, target, 0, peak);
        if(isFind != -1){
            return isFind;
        }
        isFind = binaryOrderAgnostic(arr, target, peak+1, arr.length-1);

        return isFind;
    }

    private static int binaryOrderAgnostic(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length -1;
        boolean isAsc = false;

        if(arr[0]< arr[end]){
            isAsc = true;
        }
        while(start <= end){
            int mid = start - (start-end)/2;

            if(arr[mid]==target){
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
        return -1;
    }
    private static int findPeakMountain(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start - (start-end)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
            if(start == end){
                break;
            }
        }
        return arr[start];
    }
}
