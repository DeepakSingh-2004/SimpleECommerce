package com.example.Simpleecommerceapp.DSA_Questions;

public class AddTwoNumbers {
    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        AddTwoNumbers add = new AddTwoNumbers();
        int res = add.sum(12,12);
        System.out.println(res);
    }
}
