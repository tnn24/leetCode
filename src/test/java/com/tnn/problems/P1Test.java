package com.tnn.problems;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P1Test {
    @DataProvider(parallel = true)
    public Object[][] data() {
        return new Object[][] {
                // Provided test cases
                {new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}},
                {new int[] {3, 2, 4}, 6, new int[] {1, 2}},
                {new int[] {3, 3}, 6, new int[] {0, 1}}
        };
    }

    @Test(dataProvider = "data", enabled = false)
    public void test(int[] nums, int target, int[] expectedResult) {
        int[] actual = P1.twoSums(nums, target);
        Assert.assertEquals(actual, expectedResult);
    }
}