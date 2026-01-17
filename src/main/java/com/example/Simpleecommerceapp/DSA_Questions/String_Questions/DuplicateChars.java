package com.example.Simpleecommerceapp.DSA_Questions.String_Questions;

import java.util.HashMap;
import java.util.*;

public class DuplicateChars {
        public static void main(String[] args) {
            String str = "programming";
            Map<Character, Integer> map = new HashMap<>();

            for(char c : str.toCharArray()){
                map.put(c, map.getOrDefault(c,0) +1 );
            }

            for(Map.Entry<Character, Integer> e : map.entrySet() ){
                if (e.getValue() > 1) {
                    System.out.println(e.getKey());
                }
            }
        }
}
