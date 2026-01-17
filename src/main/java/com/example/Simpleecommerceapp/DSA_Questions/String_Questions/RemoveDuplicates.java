package com.example.Simpleecommerceapp.DSA_Questions.String_Questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
        public static void main(String[] args) {
            String str = "banana";
            StringBuilder result = new StringBuilder();
            Set<Character> set =  new LinkedHashSet<>();

            for(char c : str.toCharArray()){
                set.add(c);
            }

            for(char c : set){
            result.append(c);
            }
            System.out.println(result);
        }
}
