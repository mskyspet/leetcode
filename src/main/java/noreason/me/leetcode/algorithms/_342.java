package noreason.me.leetcode.algorithms;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2016-07-17
 *
 * @author: MSK
 * @description:
 */
public class _342 {
    private static Map<Integer,Boolean> result = new HashMap<Integer,Boolean>();

    static{
        result.put(1, true);
        result.put(1<<2, true);
        result.put(1<<4, true);
        result.put(1<<6, true);
        result.put(1<<8, true);
        result.put(1<<10, true);
        result.put(1<<12, true);
        result.put(1<<14, true);
        result.put(1<<16, true);
        result.put(1<<18, true);
        result.put(1<<20, true);
        result.put(1<<22, true);
        result.put(1<<24, true);
        result.put(1<<26, true);
        result.put(1<<28, true);
        result.put(1<<30, true);
    }

    public boolean isPowerOfFour(int num) {
        if (num<0) return false;
        // 只有一个1 至少是2的N次方
        if ((num&(num-1))!=0) return false;

        //所有可能的4的合集
        // flag = 1,1<<0|4,1<<2|16,1<<4|....
        int flag = 0x55555555;
        if ((flag&num)==0)
            return false;
        return true;

    }
    @Test
    public void Test(){
        System.out.println(isPowerOfFour(1));
    }

}
