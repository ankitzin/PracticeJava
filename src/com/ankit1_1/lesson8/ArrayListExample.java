package com.ankit1_1.lesson8;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // The ArrayList not size depenedent the way it works internally, whatever the size mentioned. If half of
        // it filled then copy the existing data to new list and the new list size will be the double of old list.
        // So this is good if we dont know the size of List. and it releases the old list to free the memory.
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);

        System.out.println(list.contains(9));


    }
}
