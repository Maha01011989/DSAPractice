package org.dsapractice.starpattern;

public class NumberIncreasingRightTriangle {

    public static void main(String[] args) {
        int rows = 4;
        int value = 0;
        for (int i = 0; i < rows; i++) {
            int j = 0;
            while (j <= i) {
                System.out.print(++value + " ");
                j++;
            }
            System.out.println();
        }
    }
}


