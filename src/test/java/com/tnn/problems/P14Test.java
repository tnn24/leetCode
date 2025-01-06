package com.tnn.problems;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P14Test {
    @DataProvider(parallel = true)
    public Object[][] data() {
        return new Object[][] {
                // Provided test cases
                {new String[] {"flower","flow","flight"}, "fl"},
                {new String[] {"dog","racecar","car"}, ""},
                {new String[] {"baab","bacb","b","cbc"}, ""}
        };
    }

    @Test(dataProvider = "data", enabled = false)
    public void test(String[] input, String expectedResult) {
        String actual = P14.longestCommonPrefix2(input);
        Assert.assertEquals(actual, expectedResult);
    }
}