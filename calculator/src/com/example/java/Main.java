package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        String num1 = scanner.nextLine();
        System.out.println("Enter Second Number: ");
        String num2 = scanner.nextLine();
        int int1 = Integer.parseInt(num1);
        Double double2 = Double.parseDouble(num2);
        Double double3 = (double2 + int1);
        System.out.println(double3);
    }
}
