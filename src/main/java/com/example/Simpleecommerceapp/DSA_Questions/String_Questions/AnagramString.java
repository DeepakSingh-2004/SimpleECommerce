package com.example.Simpleecommerceapp.DSA_Questions.String_Questions;
import java.util.Arrays;


public class AnagramString {
    public static void main(String[] args) {
        String str = "silent";
        String str2 = "listen";

        char[] a1 = str.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1, a2) ? "Anagram " : "Not Anagram");
    }
    
}
