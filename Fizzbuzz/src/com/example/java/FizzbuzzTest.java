package com.example.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Russell on 15/04/2016.
 */
public class FizzbuzzTest {
    @Test
    public void testMultiplesOfThree() {
       String expected = "Fizz";
        String result = Fizzbuzz.fizzbuzz(3);
      assertEquals(expected, result);
    }
    @Test
    public void testMultiplesOfFive() {
        String expected = "Buzz";
        String result = Fizzbuzz.fizzbuzz(5);
        assertEquals(expected, result);
    }
    @Test
    public void testMultiplesOfThreeAndFive() {
        String expected = "Fizzbuzz";
        String result = Fizzbuzz.fizzbuzz(15);
        assertEquals(expected, result);
    }
    @Test
    public void TestNonMultiplesOfThreeAndFive() {
        String expected = "7";
        String result = Fizzbuzz.fizzbuzz(7);
        assertEquals(expected, result);
    }



}