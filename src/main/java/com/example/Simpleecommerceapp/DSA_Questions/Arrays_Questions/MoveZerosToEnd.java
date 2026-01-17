package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

public class MoveZerosToEnd {
        public static void main(String[] args) {
            int[] arr = {0,1,0,3,12};           // input array

            int index =0;                       // index for non-zero elements
            
            for(int num: arr){                  // loop through array
                if (num!=0) {                   // check non-zero
                    arr[index++] = num;         // move non-zero to front
                }
            }
            while (index < arr.length) {        // fill remaining with zeros
                arr[index++] = 0;
            }
            for(int num: arr){
                System.out.print(num + " ");
            }
        }
}
