package noreason.me.leetcode.algorithms;

import org.junit.Test;

/**
 * Created on 2016-07-15
 *
 * @author: MSK
 * Reverse bits of a given 32 bits unsigned integer.

 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class _190 {
    public int reverseBits(int n) {
        int result = 0;
        for(int i=0; i<32; i++){
            result = result << 1;
            if ((n & 0x01) != 0){
                result = result | 0x01;
            }
            n >>= 1;
        }
        return result;
    }
    @Test public void Test(){
        System.out.println(reverseBits(1));
    }
}
