package org.dsapractice.strings;

public class ReverseWords {

    public static void main(String[] args) {

        String s = "a good   example";

        String[] sArr = s.split(" ");
        StringBuilder newstr = new StringBuilder();

        for (int i = sArr.length - 1; i >= 0; i--) {
            if (!sArr[i].isEmpty())
                newstr.append(sArr[i].trim()).append(" ");
        }

        System.out.println(newstr.toString().trim());
    }
}
