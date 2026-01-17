package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};   // our array

        int left = 0;                  // left index starts at 0 (first element)
        int right = arr.length - 1;    // right index starts at last element (index 4)

        while (left < right) {         // repeat until left crosses right
            // swap arr[left] and arr[right]
            int temp = arr[left];      // temp is a helper variable to hold left value
            arr[left] = arr[right];    // put right value at left position
            arr[right] = temp;         // put temp (original left value) at right position

            // move pointers inward
            left++;   // move left to the next element
            right--;  // move right to the previous element
        }

        System.out.println(Arrays.toString(arr)); // print final reversed array
    }
}
