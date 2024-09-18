package org.dsapractice.strings;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        char[] strArr = s.toCharArray();
        boolean isFirstUniqueChar;

        for (int i = 0; i < strArr.length; i++) {
            isFirstUniqueChar = true;
            for (int j = 0; j < strArr.length; j++) {
                if (i == j)
                    continue;
                if (strArr[i] == strArr[j]) {
                    isFirstUniqueChar = false;
                    break;
                }
            }
            if (isFirstUniqueChar) {
                return i;
            }
        }
        return -1;
    }
}
