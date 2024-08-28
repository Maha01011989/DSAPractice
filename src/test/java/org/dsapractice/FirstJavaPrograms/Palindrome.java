package org.dsapractice.FirstJavaPrograms;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }

    static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }

}
