package com.tnn.problems;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P67Test {
    @DataProvider(parallel = true)
    public Object[][] data() {
        return new Object[][] {
                // Provided test cases
                {"11", "1", "100"},
                {"1010", "1011", "10101"}
        };
    }

    @Test(dataProvider = "data", enabled = false)
    public void test(String a, String b, String expectedResult) {
        String actual = P67.addBinary(a, b);
        Assert.assertEquals(actual, expectedResult);
    }
}