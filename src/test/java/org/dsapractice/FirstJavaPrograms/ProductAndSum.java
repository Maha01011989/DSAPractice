package org.dsapractice.FirstJavaPrograms;

public class ProductAndSum {

    public static void main(String[] args) {
        int a = 234;
        int sum = 0;
        int product = 1;
        int temp ;


        while (a > 0) {
            temp = a % 10;
            sum += temp;
            product *= temp;
            a = a / 10;
        }

        System.out.println(product-sum);
    }


}
