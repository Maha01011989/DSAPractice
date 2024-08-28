package org.dsapractice.FirstJavaPrograms;

public class TypeOfTriangle {

    public static void main(String[] args) {
        int[] nums = {8,4,4};
        System.out.println(typeOfTriangle(nums));

    }


    static String typeOfTriangle(int[] a) {
        int i = 0;
        if (a[i] == a[i + 1] && a[i + 1] == a[i + 2]) {
            return "Equilateral";
        } else if (a[i] == a[i + 1] || a[i] == a[i + 2] || a[i + 1] == a[i + 2]) {
            if (a[i] + a[i + 1] > a[i + 2] && a[i + 1] + a[i + 2] > a[i] && a[i] + a[i + 2] > a[i + 1])
                return "Isosceles";
        } else if (a[i] + a[i + 1] > a[i + 2] && a[i + 1] + a[i + 2] > a[i] && a[i] + a[i + 2] > a[i + 1]) {
            return "Scalene";
        }
        return "none";
    }

}
