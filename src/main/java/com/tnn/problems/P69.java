package com.tnn.problems;

public class P69 {
    public static int mySqrt(int x) {
        // Use binary search
        if (x == 1) {
            return 1;
        }
        int bottom = 0;
        int top = x;
        int test = (top + bottom) / 2;
        while (top - bottom > 1) {
            if ((long) test * test > x) {
                top = test;
            } else {
                bottom = test;
            }
            test = (top + bottom) / 2;
        }
        return bottom;
    }
}