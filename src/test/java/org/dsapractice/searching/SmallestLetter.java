package org.dsapractice.searching;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};

        char target = 'c';

        System.out.println(nextGreatestLetter(letter, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else if (letters[mid] > target) {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }
}

