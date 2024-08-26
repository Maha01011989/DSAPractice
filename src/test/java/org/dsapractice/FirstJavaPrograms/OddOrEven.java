package org.dsapractice.FirstJavaPrograms;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(evenOrOdd(17));

    }

    static String evenOrOdd(int a) {
        if (a >= 0) {
            if (a % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }
        } else {
            return "negative integer:neither odd nor even";
        }

    }
}
