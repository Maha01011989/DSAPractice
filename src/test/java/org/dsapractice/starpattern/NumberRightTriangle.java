package org.dsapractice.starpattern;

public class NumberRightTriangle {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        for (int i = 0; i < rows; i++) {
            int value = 0;
            for (int j = 0; j < cols; j++) {
                if (i >= j) {
                    System.out.print(value++ + " ");
                }
            }
            System.out.println();

        }
    }

}
