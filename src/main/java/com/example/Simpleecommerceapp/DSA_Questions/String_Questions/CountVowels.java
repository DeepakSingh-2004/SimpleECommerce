package com.example.Simpleecommerceapp.DSA_Questions.String_Questions;

public class CountVowels {
        public static void main(String[] args) {
            String str = "java interview";
            int vowels = 0, consonants = 0;

            str = str.toLowerCase();
            for(char c : str.toCharArray()){
                if (c >= 'a' && c <= 'z')  {
                    if ("aeiou".indexOf(c)!= -1) 
                        vowels++;
                        else
                            consonants++;
                    
                }
            }
            System.out.println("VOWELS: " +vowels);
            System.out.println("CONSONANTS: " +consonants);
        }
}
