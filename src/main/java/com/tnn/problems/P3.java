package com.tnn.problems;

import java.util.HashMap;
import java.util.Map;


/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
 */
public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        int sLongest = 0;
        Map<Character, Integer> charIndex = new HashMap<>();
        for (int j = 0, i = 0; j < s.length(); j++) {
            Character c = s.charAt(j);
            if (charIndex.containsKey(c)) {
                i = Math.max(charIndex.get(c), i);
            }
            sLongest = Math.max(sLongest, j - i + 1);
            charIndex.put(c, j + 1);
        }
        return sLongest;
    }
}