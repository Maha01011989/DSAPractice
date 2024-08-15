package org.dsapractice.starpattern;

public class Pattern {


    public static void main(String[] args) {
        //Q1

//    *
//    * *
//    * * *
        System.out.println("Solution for Q1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Q2

//        * * *
//        * *
//        *
        System.out.println("Solution for Q2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        //Q3

//        *
//      *   *
//    *   *   *
        System.out.println("Solution for Q3");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
                if (i == 0 && j == 2) {
                    System.out.print("*");
                } else if (i != 0 && i % 2 == 0 && j % 2 == 0) {
                    System.out.print("*");
                } else if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
