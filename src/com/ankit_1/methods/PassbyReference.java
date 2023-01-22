package com.ankit_1.methods;

public class PassbyReference {
    public static void main(String[] args) {
        String name = "Ankit Singh";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Kiran Yadav";
    }
}
