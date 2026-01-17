package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};              // sorted array with duplicates

        int j = 0;                              // pointer for unique elements

        for(int i=1; i<arr.length; i++ ){       // loop through array
            if (arr[i]!=arr[j]) {               // check for new element
                j++;                            // move unique pointer
                arr[j] = arr[i];                // place unique value
            }
        }
        for(int i=0; i<=j; i++){                // print unique elements
            System.out.println(arr[i] + " ");
        }
    }
}
