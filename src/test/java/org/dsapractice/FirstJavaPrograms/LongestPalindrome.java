package org.dsapractice.FirstJavaPrograms;

public class LongestPalindrome {

    public static void main(String[] args) {
        int sum = 0;
        String s = "ccc";
        boolean isOnePresent = false;
        int count;

        while (s.toCharArray().length > 0) {
            count = 1;
            for (int j = 1; j < s.toCharArray().length; j++) {
                if (s.toCharArray()[0] == s.toCharArray()[j]) {
                    count++;
                }
            }
            //System.out.println(count);
            if (count % 2 == 0) {
                sum += count;
            } else if (count % 2 != 0 && count > 1) {
                sum += (count - 1);
            } else if (count == 1) {
                isOnePresent = true;
            }
            s = s.replaceAll(String.valueOf(s.toCharArray()[0]), "");

        }
        if (isOnePresent)
            System.out.println(sum + 1);
        else
            System.out.println(sum);

    }


}


