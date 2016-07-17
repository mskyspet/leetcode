package noreason.me.leetcode.algorithms;

import org.junit.Test;

/**
 * Created on 2016-07-17
 *
 * @author: MSK
 * @description:
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 * If the last word does not exist, return 0.

 * Note: A word is defined as a character sequence consists of non-space characters only.

 * For example,
 * Given s = "Hello World",
 * return 5.
 */
public class _58 {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        if (len==0) return 0;
        int endIdx = len-1;
        while(s.charAt(endIdx)==' ' && endIdx-- > 0 );
        int startIdx = endIdx;
        for (;startIdx>=0 && s.charAt(startIdx)!=' '; startIdx--);
        return endIdx - startIdx;
    }

    @Test
    public void Test(){
        System.out.println(lengthOfLastWord("a "));
    }


}
