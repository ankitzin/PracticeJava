package com.binarysearch.problems;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 25;
        System.out.println(floorNumber(arr, target));
    }

    private static int floorNumber(int[] arr, int target) {
        try {
            int start = 0;
            int end = arr.length;

            while(start<end){
                if(target > arr[end-1]){
                    return -1;
                }
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return arr[mid];
                }
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return arr[end];
        }
        catch (Exception error){
            System.out.println("value not available in the array");
            return -1;
        }
    }
}
