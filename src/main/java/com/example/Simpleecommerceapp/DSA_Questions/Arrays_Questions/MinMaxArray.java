package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 20, 2};   // our array

        int min = arr[0];   // assume first element is min → 10
        int max = arr[0];   // assume first element is max → 10

        // loop through each number in array
        for (int val : arr) {
            if (val < min) {    // if we find smaller number, update min
                min = val;
            }
            if (val > max) {    // if we find bigger number, update max
                max = val;
            }
        }
        System.out.println("Min = " + min + ", Max = " + max);
    }
}
