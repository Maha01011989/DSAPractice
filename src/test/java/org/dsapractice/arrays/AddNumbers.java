package org.dsapractice.arrays;

public class AddNumbers {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int sum = 0;
        do {
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        while (num >= 10);
        return num;
    }
}
