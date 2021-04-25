package com.java.string;

public class RegexString {
    public static void main(String[] args) {
        String regex="^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-9][0-9]|3[0-5][1-9]|36[0-6])[d])$";
        String str="366d";
        boolean matches = str.matches(regex);
        System.out.println(matches);
    }
}
