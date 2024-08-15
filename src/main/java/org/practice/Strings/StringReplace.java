package org.practice.Strings;

public class StringReplace {

    public static void main(String[] args) {

        System.out.println(getDesiredString("MAhalAkshmi", "a", "$"));
    }

    public static String getDesiredString(String a, String replaceable, String specChar) {
        a = a.toLowerCase();
        replaceable = replaceable.toLowerCase();
        StringBuilder replaceWith = new StringBuilder();
        for (int i = 0; i < a.toCharArray().length; i++) {
            replaceWith.append("\\" + specChar);
            if (a.contains(replaceable)) {
                a = a.replaceFirst(replaceable, replaceWith.toString());
            } else {
                System.out.println("Break is executed at the " + i + "th iteration");
                break;
            }
        }
        return a;

    }

}

