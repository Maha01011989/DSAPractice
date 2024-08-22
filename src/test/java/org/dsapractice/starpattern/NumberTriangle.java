package org.dsapractice.starpattern;

public class NumberTriangle {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 8;
        int value = 0;

        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j <= cols; j++) {
                System.out.print(" ");

                if (j == cols / 2 - i) {
                    value = ++value;
                    while (count < i + 1) {
                        System.out.print(value + " ");
                        count++;
                    }
                    break;
                }
            }
            System.out.println();

        }
    }
}

