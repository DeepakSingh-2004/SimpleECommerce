package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

public class FindBiggestArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 9};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        System.out.println("BIGGEST NUMBER OF AN ARRAY IS: " +max);
    }
}
