package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};      // input array
        boolean isSorted = true;          // Flag Variable

        for(int i=1; i<arr.length; i++){  // start from index 1
            if (arr[i] < arr[i-1]) {      // compare with previous element
                isSorted = false;         // array is not sorted
                break;                    // stop checking further
            }
        }
        System.out.println(isSorted);     // true or false
    }

}
