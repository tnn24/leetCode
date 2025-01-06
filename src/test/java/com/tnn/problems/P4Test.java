package com.tnn.problems;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P4Test {
    @DataProvider(parallel = true)
    public Object[][] data() {
        return new Object[][] {
                // Provided test cases
                {new int[] {1, 3}, new int[] {2}, 2},
                {new int[] {1, 2}, new int[] {3, 4}, 2.5}
        };
    }

    @Test(dataProvider = "data", enabled = true)
    public void test(int[] input1, int[] input2, double expectedResult) {
        double actual = P4.findMedianSortedArrays(input1, input2);
        Assert.assertEquals(actual, expectedResult);
    }
}