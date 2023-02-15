package com.binarysearch.problems;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,7,5,6};
        System.out.println(linearSearchmaximum(arr));
        System.out.println(binarySearchMaximum(arr));

    }

    private static int linearSearchmaximum(int[] arr) {
        int max = 0;
        for(int i: arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    private static int binarySearchMaximum(int[] arr){
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
