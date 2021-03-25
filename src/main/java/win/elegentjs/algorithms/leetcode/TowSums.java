package win.elegentjs.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1: 两数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * <p>
 * 分析：
 * 时间复杂度：
 * 空间复杂度：
 */
public class TowSums {

    /**
     * 算法思路：
     * 利用哈希表查找元素时间复杂度为O(1)的特点，执行目标值查找，
     * key: 数值
     * value: 下标位
     * @param sums 给定的数组
     * @param target 目标值
     * @return 配置值的下标组成的数组
     */
    public int[] twoSum(int[] sums, int target) {
        if (sums == null || sums.length == 0) return null;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sums.length; i ++) {
            int another = target - sums[i];

            if (map.containsKey(another)) {
                return new int[] {i, map.get(another)};
            }

            map.put(sums[i], i);
        }

        return null;
    }
}
