package com.ankit;


public class ConditionLoopwork {
    public static void main(String[] args) {
        /*
        Syntax of If statement
        if ( boolean expression T or F){
            //body
        }
        else {
            // do this
        }
        * */
        long salary = 25000;
        if(salary>10000){
            salary = salary+ 2000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println(salary);
        /*
        * if{} else if{} else{} conditions
        * */
        if(salary>10000 && salary <20000){
            salary += 2000;
        }
        else if (salary > 20000){
            salary += 3000;
        }else{
            salary += 1000;
        }

        System.out.println(salary);
        System.out.println("-----------------------------");

    }
}
