package noreason.me.leetcode.algorithms;

import org.junit.Test;

/**
 * Created on 2016-07-17
 *
 * @author: MSK
 * @description:

 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 */

class NumArray {

    private int[][] cached;

    public NumArray(int[] nums) {
        int len = nums.length;
        cached = new int[len][len];

        for (int i=0;i<len;i++){
            cached[i][i] = nums[i];
            for (int j=i+1;j<len;j++){
                cached[i][j] = cached[i][j-1]+nums[j];
            }
        }
    }

    public int sumRange(int i, int j) {
        return cached[i][j];
    }
}


public class _303 {

    @Test
    public void Test(){
        int[][] a = new int[3][4];
        System.out.println(a.length);
    }
}
