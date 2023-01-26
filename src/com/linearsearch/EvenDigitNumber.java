package com.linearsearch;

public class EvenDigitNumber {

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers2(arr));
    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        for(int val : nums){
            int count = 0;
            while(val!=0){
                val /= 10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
    static int findNumbers2(int[] nums) {
        int ans = 0;
        for(int val : nums){
//            int count = (int)(Math.log10(val)) + 1;
            if(((int)(Math.log10(val)) + 1) %2==0){
                ans++;
            }
        }
        return ans;
    }
    static int findNumbers3(int[] nums) {
        int ans = 0;
        for(int val : nums){
            if((val > 10 && val<100) ||( val >999 && val < 10000) || (val>99999 && val<1000000)){
                ans++;
            }
        }
        return ans;
    }

}
