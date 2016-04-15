package com.example.java;

public class Main {


    public static void main(String[] args) {

        String result = fizzbuzz(7);
        System.out.println(result);

    }

    private static String fizzbuzz(int num) {
        if (num % 15 == 0) {
            String response = ("Fizzbuzz");
            return response;
        }
        else if (num % 5 == 0) {
           String response = ("Buzz");
            return response;
        } else if (num % 3 == 0) {
            String response =("Fizz");
            return response;
        } else {
           String response = Integer.toString(num);
            return response;
        }

    }
}
