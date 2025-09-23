package com.example.Simpleecommerceapp.DSA_Questions;

import java.util.Scanner;

public class Add_N_Numbers {
    public static void main(String[] args) {
        int n; // N is the number if elements
        Scanner obj = new Scanner(System.in); // Initialising the Scanner Class
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        n = obj.nextInt();   // Taking the input of N
        int sum = 0;

        for (int i=0; i<n; i++){
            int a = obj.nextInt();

            sum += a;

        }
        System.out.println("SUM OF N NUMBERS IS: " +sum); //first you'll have to type into console how many n numbers of sum you want
    }
}
