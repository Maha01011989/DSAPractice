package org.dsapractice.searching;

public class GuessNumber {

    public static void main(String[] args) {
        System.out.println(guessNumber(2));
    }

    public static int guessNumber(int n) {

        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == -1) {
                end = mid - 1;
            }
            if (guess(mid) == 1) {
                start = mid + 1;
            }
            if (guess(mid) == 0) {
                return mid;
            }
        }

        return start;
    }

    public static int guess(int n) {

        int pick = 2;
        if (n < pick)
            return 1;
        else if (n > pick) {
            return -1;
        }
        return 0;
    }
}



