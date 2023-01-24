package com.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 8;
        int start=2, end=7;
        System.out.println(search(arr, target, start, end));
    }

    static boolean search(int[] arr, int target, int i, int j){
        for (int index = i; index <= j; index++) {
            if(arr[index] == target){
                return true;
            }
        }
        return false;
    }
}
