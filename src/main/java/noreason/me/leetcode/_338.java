package noreason.me.leetcode;

/**
 * Created on 2016-07-15
 *
 * @author: MSK
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 */
public class _338 {

    public int[] countBits(int num) {
        int[] result = new int[num+1];
        result[0] = 0;
        if (num!=0) result[1] = 1;

        int base=2;
        for (int i=2;i<=num;){
            result[i] = result[i-base] + 1;
            i++;
            if (i%base==0) base<<=1;
        }
        return result;
    }

}
