package com.example.java;

public class Fizzbuzz {

    public static String fizzbuzz(int num) {
        String response = "";
        if (num % 15 == 0) {
            response = ("Fizzbuzz");
        } else if (num % 5 == 0) {
            response = ("Buzz");
        } else if (num % 3 == 0) {
            response = ("Fizz");
        } else {
            response = Integer.toString(num);
        }
        return response;

    }

}
