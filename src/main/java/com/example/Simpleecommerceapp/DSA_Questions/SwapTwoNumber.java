package com.example.Simpleecommerceapp.DSA_Questions;

public class SwapTwoNumber {

    // Function to swap two numbers
    // Using temporary variable
    static  void swapValuesUsingThirdVariable(int a, int b){
        // Swapping the values
        int temp =a;
        a=b;
        b=temp;
        System.out.println("Value of a is " + a
                + " and Value of b is " + b);
    }
    // Main driver code
    public static void main(String[] args) {
     int a = 10, b = 5; // Random integer values

        // Calling above function to
        // reverse the numbers
        swapValuesUsingThirdVariable(a, b);
    }
}
