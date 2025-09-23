package com.example.Simpleecommerceapp.javaPractice;

public class ArrayPractice {
    public static void main(String[] args) {
       //Problem 1
        float[] arr1 = {98, 89, 83, 29, 82};
        float sum=0;

        for(float element: arr1){
            sum = sum + element;
        }
        System.out.println("THE VALUE OF SUM IS: " +sum);

        //Problem 2
        float[] marks = {98, 89, 83, 29, 82};
        float num = 89;
        boolean IsInArray = false;
        for(float element: marks){
            if (num==element){
                IsInArray = true;
                break;
            }
        }
        if (IsInArray){
            System.out.println("THE VALUE IS PRESENT IN THE ARRAY");
        }else{
            System.out.println("THE VALUE IS NOT PRESENT IN THE ARRAY");
        }
    }
}
