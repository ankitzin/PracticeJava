package com.ankit;

public class Loops {
    public static void main(String[] args) {
        /*
        * for(initialization; condition; increatement or decreameant){//body}
        * */
        for(int i = 1; i<= 5; i++){
            System.out.println(i);
        }

        int i = 1;
        while(i<=5){
            System.out.print(i + " ");
            i += 1;
        }

        i = 0;
        do{
            System.out.println(i + " ");
            i += 1;
        }while(i <=5);
    }
}
