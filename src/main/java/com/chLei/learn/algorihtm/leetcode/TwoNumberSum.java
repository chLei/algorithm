package com.chLei.learn.algorihtm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 */
public class TwoNumberSum {

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 6, 5, 18, 7};

        int target = 5;

        int[] res = twoSumMap2(array, target);

        if (res == null) {
            System.out.println("找不到结果");
        } else {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
            }
        }
    }

    /**
     * 将所有数字放入一个map中，然后在map中寻找对应值
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumMap2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    /**
     * 将所有数字放入一个map中，然后在map中寻找对应值
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int mid = target - nums[i];
            if (map.containsKey(mid) && map.get(mid) != i) {
                return new int[]{i, map.get(mid)};
            }
        }

        return null;
    }

    /**
     * 暴力解法，时间复杂度o(n平方)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if ((a + b) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
