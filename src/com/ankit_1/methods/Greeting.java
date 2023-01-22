package com.ankit_1.methods;

public class Greeting {
    public static void main(String[] args) {
        String greet = "Good Morning";
        String name = nameSelect(greet);
        System.out.println(name);
    }

    static String nameSelect(String greet) {
        String name = " Ankit. ";
        return greet + name;
    }
}
