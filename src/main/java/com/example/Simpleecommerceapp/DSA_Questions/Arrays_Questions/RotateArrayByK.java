package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};                // input array
        int k = 2;                              // number of rotations

        k = k % arr.length;                     // handle k > array length

        reverse(arr, 0, k-1);             // reverse first part
        reverse(arr, k, arr.length -1);         // reverse second part
        reverse(arr, 0, arr.length-1);    // reverse whole array
  
    for(int num: arr){
        System.out.print(num + " ");
    }
  }

    static void reverse(int[] arr, int left, int right){
        while (left < right) {
            int temp = arr[left];               // swap logic
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
}
}