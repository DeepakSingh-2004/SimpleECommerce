package com.example.Simpleecommerceapp.DSA_Questions;

public class primeCheck {

    public static boolean isPrime(int n){
        if (n<2)
            return false;
        int limit = (int) Math.sqrt(n);
        for (int i=2; i<=limit; i++){
            if (n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n =29;
        System.out.println(n +" is prime?: " + isPrime(n));
    }
}
