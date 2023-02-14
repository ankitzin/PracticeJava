package com.binarysearch.problems;

/*
* letters = ["c","f","j"], target = "a"
* Output: "c"
* */
public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(findSmallestOfBigger(letters, target));
    }

    private static char findSmallestOfBigger(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
