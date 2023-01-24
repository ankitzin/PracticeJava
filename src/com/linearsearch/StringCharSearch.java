package com.linearsearch;

public class StringCharSearch {
    public static void main(String[] args) {
        String str = "ankit";
        char target = 'j';
        System.out.println(search(str,target));
    }
    static boolean search(String str, char target){
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}

