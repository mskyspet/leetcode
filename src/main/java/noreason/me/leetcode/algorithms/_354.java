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
public class _354 {

    private static Map<Character,Boolean> vowels = new HashMap<Character,Boolean>();
    static {
        //aeiou
        vowels.put('a', true);
        vowels.put('A', true);
        vowels.put('e', true);
        vowels.put('E', true);
        vowels.put('i', true);
        vowels.put('I', true);
        vowels.put('o', true);
        vowels.put('O', true);
        vowels.put('u', true);
        vowels.put('U', true);
    }
    private boolean isVowel(char c){
        return vowels.get(c)!=null;
    }
    public String reverseVowels(String s) {
        if (s==null||s.length()==0) return s;
        char[] chars = s.toCharArray();
        int len = chars.length;
        int subIdx = 0;
        int postIdx = len-1;
        while(subIdx<postIdx){
            while(subIdx<=postIdx && !isVowel(chars[subIdx])) subIdx++;
            while(postIdx>=subIdx && !isVowel(chars[postIdx])) postIdx--;
            if (postIdx>subIdx) {
                char c = chars[subIdx];
                chars[subIdx] = chars[postIdx];
                chars[postIdx] = c;
            }
            subIdx++;
            postIdx--;
        }
        return new String(chars);
    }

    @Test
    public void Test(){
        System.out.println(reverseVowels("hello"));
        int n = 3;
        while (true){
            int pre = n;
            n = n*3;
            if (n<pre){
                System.out.print(pre);
                break;
            }
        }
    }
}
