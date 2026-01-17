package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

public class FindSmallestArray {
        public static void main(String[] args) {
            int[] arr = {10,5,20,8};
            int min = arr[0];               // assume first element is smallest

            for(int i=1; i<arr.length; i++){
                if (arr[i]<min) {
                    min = arr[i];
                }
            }
            System.out.println("Smallest Element:" + min);
        }
}
