package com.tnn.problems;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    /**
     * Problem 1 - Two Sum
     * @param nums input array
     * @param target target sum
     * @return indices of the first integers adding to the target sum
     */
    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> valToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int complementVal = target - val;
            if (valToIndex.containsKey(complementVal)) {
                return new int[] {valToIndex.get(complementVal), i};
            }
            if (!valToIndex.containsKey(val)) {
                valToIndex.put(val, i);
            }
        }
        return new int[] {-1, -1};
    }
}