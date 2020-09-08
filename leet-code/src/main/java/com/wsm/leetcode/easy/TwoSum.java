package com.wsm.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangsenmu
 * @date 2020-8-19 12:02
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {


    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(nums, target);

        System.out.println(res);

    }


    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.get(res) == null) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(res), i};
            }
        }
        return null;
    }


}