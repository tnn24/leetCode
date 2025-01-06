package com.tnn.problems;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P69Test {
    @DataProvider(parallel = true)
    public Object[][] data() {
        return new Object[][] {
                // Provided test cases
                {4, 2},
                {8, 2},

                {0, 0},
                {1, 1},
                {2, 1},
                {9, 3},
                {Integer.MAX_VALUE, 46340}
        };
    }

    @Test(dataProvider = "data", enabled = true)
    public void test(int x, int expectedResult) {
        int actual = P69.mySqrt(x);
        Assert.assertEquals(actual, expectedResult);
    }
}