package com.tnn.problems;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 */
public class P14 {
    public static String longestCommonPrefix(String[] strs) {
        char[][] chars = new char[strs.length][];
        for (int i = 0; i < strs.length; i++) {
            chars[i] = strs[i].toCharArray();
        }

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < chars[0].length; i++) {
            char toCheck = chars[0][i];
            for (int ii = 1; ii < chars.length; ii++) {
                if (chars[ii].length <= i || chars[ii][i] != toCheck) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(toCheck);
        }
        return commonPrefix.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = findPrefix(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            prefix = findPrefix(prefix, strs[i]);
        }
        return prefix;
    }

    private static String findPrefix(String s1, String s2) {
        char[] sCharArr1 = s1.toCharArray();
        char[] sCharArr2 = s2.toCharArray();

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (sCharArr1[i] == sCharArr2[i]) {
                prefix.append(sCharArr1[i]);
            } else {
                break;
            }
        }
        return prefix.toString();
    }
}