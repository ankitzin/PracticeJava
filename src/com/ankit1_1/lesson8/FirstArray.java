package com.ankit1_1.lesson8;

public class FirstArray {
    public static void main(String[] args) {
        // Syntax
        // datatype[] variable_name = new datatype[Size];
        // Store 5 roll number
        // int[] roll_numbers = new int[5];
        // or
        // int[] roll_numbers = {0,1,2,3,4,5,6};
        // All types of datatype inside an array will be same.
        // int[] roll_numbers ; // Declaration it is defined in the stack
        // roll_number = new int[5] // initialisation actually memory creation in heap memory.
        // Array objects are in heap.
        // Array objects are not continous.
        // Dynamically Memory Allocated.

        int[] num = new int[5]; // new key word is used to create new memory.
        String[] values = new String[5]; // this will create the empty initialization in Heap memory.

        System.out.println(num[1]+" "+ values[3]);
    }
}
