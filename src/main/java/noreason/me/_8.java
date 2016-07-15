package noreason.me;

import org.junit.Test;

/**
 * Created on 2016-07-15
 *
 * @author: MSK
 * @description: Copyright (c) 2016 infohold inc. All rights reserved.
 */
public class _8 {
    public int myAtoi(String str) {
        if (str==null||str.length()==0) return 0;
        char[] chars = str.toCharArray();
        int result = 0;
        int factor = 1;
        boolean hasSymbol = false;
        boolean startNum = false;

        int minBase = Integer.MIN_VALUE/10;
        int maxBase = Integer.MAX_VALUE/10;

        for (int i=0;i<chars.length;i++){
            int v = (int) chars[i];

            if (v==32){ // ' '
                if (hasSymbol||startNum) break;
                else continue;
            }
            if (v==43 || v==45){
                if (hasSymbol||startNum) break;
                hasSymbol = true;
                if (v==45) factor = -1;
                continue;
            }

            if (v<48 || v> 57) break;
            startNum=true;

            if (factor==-1){
                if (minBase > result) return Integer.MIN_VALUE;
                result = result*10;
                if (result !=0 && result - Integer.MIN_VALUE < (v-48)) return Integer.MIN_VALUE;
                result -= (v-48);
            }
            else{
                if (maxBase < result) return Integer.MAX_VALUE;
                result = result*10;
                if (Integer.MAX_VALUE - result < (v-48)) return Integer.MAX_VALUE;
                result += (v-48);
            }
        }
        return result;
    }

    @Test public void Covert(){
        System.out.println(myAtoi("-2147483647"));
    }
}
