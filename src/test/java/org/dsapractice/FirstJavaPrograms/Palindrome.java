package org.dsapractice.FirstJavaPrograms;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));

    }

    static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }

    public static boolean isValidPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "").toLowerCase());
        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        } else {
            return false;
        }

    }

}
