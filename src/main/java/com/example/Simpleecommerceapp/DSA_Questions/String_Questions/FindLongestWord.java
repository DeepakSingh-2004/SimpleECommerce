package com.example.Simpleecommerceapp.DSA_Questions.String_Questions;

public class FindLongestWord {
        public static void main(String[] args) {
            String str = "java is very powerful language";

            String[] words = str.split(" ");

            String longestword = words[0];

            for(String word: words){
                if (word.length() > longestword.length()) {
                    longestword = word;
                }
            }
            System.out.println(longestword);
        }
}
