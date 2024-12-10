package com.tnn.problems;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P3Test {
    @DataProvider(parallel = true)
    public Object[][] data() {
        return new Object[][] {
                // Provided test cases
                {"abcabcbb", 3},
                {"bbbbb", 1},
                {"pwwkew", 3}
        };
    }

    @Test(dataProvider = "data", enabled = true)
    public void test(String input, int expectedResult) {
        int actual = P3.lengthOfLongestSubstring(input);
        Assert.assertEquals(actual, expectedResult);
    }
}