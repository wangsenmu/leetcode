package com.wsm.leetcode.medium;

/**
 * @author wangsenmu
 * @date 2020-8-19 17:13
 * Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {


        for (int i = 0; i < s.length() - 1; i++) {

            int j = i++;
            int k = i;

            String subStr = s.substring(i, j);
            if (subStr.contains(s.substring(k, k + 1))) {


            }


        }

        return 1;


    }


}
