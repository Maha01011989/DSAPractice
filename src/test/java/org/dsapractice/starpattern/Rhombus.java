package org.dsapractice.starpattern;

public class Rhombus {

    public static void main(String[] args) {

        int rows = 5;
        int cols = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print(sb.append(" "));
        }
    }
}