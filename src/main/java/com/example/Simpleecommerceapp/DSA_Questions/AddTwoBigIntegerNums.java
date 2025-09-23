package com.example.Simpleecommerceapp.DSA_Questions;

import java.math.BigInteger;

public class AddTwoBigIntegerNums {
    public static void main(String[] args) {
        BigInteger sum;  // BigInteger object to store result

        // Two objects of String created
        // Holds the values to calculate the sum
        String input1 = "9482423949832423492342323546";
        String input2 = "6484464684864864864864876543";

        // Convert the string input to BigInteger
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);

        // Using add() method
        sum = a.add(b);

        // Display the result in BigInteger
        System.out.println("SUM OF TWO BIG INTEGERS IS: " +sum);
    }
}
