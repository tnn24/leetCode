package com.tnn.problems;

public class P9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int xOriginal = x;
        int xReversed = x % 10;
        xOriginal /= 10;
        while (xOriginal > 0) {
            xReversed = xReversed * 10 + xOriginal % 10;
            xOriginal /= 10;
        }
        return xReversed == x;
    }
}
