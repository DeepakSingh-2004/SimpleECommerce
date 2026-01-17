package com.example.Simpleecommerceapp.DSA_Questions.Arrays_Questions;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int remaining = target - arr[i];

            if (map.containsKey(remaining)) {
                System.out.println(map.get(remaining) + "," + i);
                return;
            }
            map.put(arr[i], i);
        }
    }
}
