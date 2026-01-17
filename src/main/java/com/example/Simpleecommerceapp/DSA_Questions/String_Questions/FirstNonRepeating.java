package com.example.Simpleecommerceapp.DSA_Questions.String_Questions;

import java.util.*;                               // Import utility classes

public class FirstNonRepeating {
    public static void main(String[] args) {

        String s = "swiss";                       // Input string

        // LinkedHashMap stores characters with their frequency
        // and maintains insertion order
        Map<Character, Integer> map =
                new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {          // Convert string to char array
            map.put(
                c,                                // Character as key
                map.getOrDefault(c, 0) + 1        // Get existing count or 0, then increment
            );
        }

        // Find the first character with frequency 1
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {               // Check non-repeating character
                System.out.println(e.getKey());   // Print first non-repeating character
                break;                            // Stop after first match
            }
        }
    }
}
