package org.dsapractice.FirstJavaPrograms;

public class ArmStrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmStrong(1634));

        System.out.println(isArmStrong(153));
    }

    static boolean isArmStrong(int a) {
        int temp = a;
        int sum = 0;
        int pow=getNoOfDigits(a);
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += (int) Math.pow(lastDigit, pow);
            temp /= 10;
        }

        if (sum == a) {
            return true;
        }
        return false;
    }

    static int getNoOfDigits(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

}
