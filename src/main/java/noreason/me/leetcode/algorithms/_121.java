package noreason.me.leetcode.algorithms;

import org.junit.Test;

/**
 * Created on 2016-07-16
 *
 * @author: MSK
 * @description:
 */
public class _121 {
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length==0) return 0;
        int[] result = new int[prices.length];
        int maxResult = 0;
        for (int i=1;i<result.length;i++){
            result[i] = result[i-1] + prices[i] - prices[i-1];
            if (result[i]<0) result[i]=0;
            if (maxResult < result[i]) maxResult = result[i];
        }
        return maxResult;
    }

    @Test public void Test(){
        int[] input = {7,1,5,3,6,4};
        System.out.println(maxProfit(input));
    }
}
