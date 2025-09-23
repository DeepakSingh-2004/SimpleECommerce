package com.example.Simpleecommerceapp.javaPractice;

public class ArrayAndTwoDimensionalArray {
    public static void main(String[] args) {
        //Declaration and memory allocation
       /* int[] marks;
        marks = new int[5]; //memory allocation
        marks[0]= 23;
        marks[1]= 33;
        marks[2]= 53;
        marks[3]= 43;
        marks[4]= 13;
        System.out.println(marks[4]);
        System.out.println(marks.length);*/


        int[] mark = {98, 89, 83, 29, 82};
      //  System.out.println("LENGTH OF THE ARRAY IS: " +mark.length);
//
//        //Displaying the naive method
//        System.out.println(mark[0]);
//        System.out.println(mark[1]);
//        System.out.println(mark[2]);
//        System.out.println(mark[3]);
//        System.out.println(mark[4]);

        //Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
        }

        //Displaying the Array (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i=mark.length -1; i>=0; i--){
            System.out.println(mark[i]);
        }

        //Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element: mark){
            System.out.println(element);
        }

        //Displaying the  2D-Array
        int[][] flats;
        flats = new int[2][3];
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;

        System.out.println("Printing using 2D-array");
        for (int i=0; i<flats.length; i++){
            for (int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }



    }


}
