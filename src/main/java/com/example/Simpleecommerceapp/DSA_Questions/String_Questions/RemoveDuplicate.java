package com.example.Simpleecommerceapp.DSA_Questions.String_Questions;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "programming";                // Input string with duplicate characters

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        // LinkedHashSet does not allow duplicates and preserves insertion order

        for (char ch : str.toCharArray()) {        // Iterate through each character of the string
            set.add(ch);                           // Add character to set (duplicates ignored)
        }

        StringBuilder result = new StringBuilder(); // Used to build final string efficiently

        for (char ch : set) {                      // Iterate through unique characters in order
            result.append(ch);                     // Append each character to result
        }

        System.out.println("After Removing Duplicates: " + result);
    }
}

