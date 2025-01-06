package com.tnn.problems;


/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 */
public class P4 {
    private static double getMedian(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length % 2 == 1) {
            return nums[nums.length / 2];
        }
        return (((double) nums[nums.length / 2]) + nums[nums.length / 2 - 1]) / 2;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return getMedian(nums2);
        }
        if (nums2.length == 0) {
            return getMedian(nums1);
        }
        int mIndex = (nums1.length + nums2.length) / 2 + 1;
        int i1, i2, v1, v2, evalCount = 2;
        if (nums1.length > 1 && nums1[1] < nums2[0]) {
            i1 = 2;
            i2 = 0;
            v1 = nums1[0];
            v2 = nums1[1];
        } else if (nums2.length > 1 && nums2[1] < nums1[0]) {
            i1 = 0;
            i2 = 2;
            v1 = nums2[0];
            v2 = nums2[1];
        } else {
            i1 = 1;
            i2 = 1;
            v1 = Math.min(nums1[0], nums2[0]);
            v2 = Math.max(nums1[0], nums2[0]);
        }
        while (evalCount < mIndex) {
            v1 = v2;
            evalCount++;
            if (i2 == nums2.length) {
                v2 = nums1[i1++];
            } else if (i1 == nums1.length) {
                v2 = nums2[i2++];
            } else if (nums1[i1] <= nums2[i2]) {
                v2 = nums1[i1++];
            } else {
                v2 = nums2[i2++];
            }
        }
        return ((nums1.length + nums2.length) % 2 == 1) ? v2 : (((double) v1) + v2) / 2;
    }
}