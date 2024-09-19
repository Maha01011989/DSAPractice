package org.dsapractice.strings;

public class FindDifference {

    public static void main(String[] args) {


        String s = "a";
        String t = "aa";

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();

        for (char c : sArr) {
            t = t.replaceFirst(String.valueOf(c), " ").trim();
        }
        return t.charAt(0);
    }
}
