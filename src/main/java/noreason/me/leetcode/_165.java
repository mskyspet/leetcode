package noreason.me.leetcode;

import javax.xml.bind.ValidationEvent;

/**
 * Created on 2016-07-15
 *
 * @author: MSK
 *
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 * Here is an example of version numbers ordering:

 * 0.1 < 1.1 < 1.2 < 13.37
 */
public class _165 {
    public int compareVersion(String version1, String version2) {
        char[] vchars1 = version1.toCharArray();
        char[] vchars2 = version2.toCharArray();
        int idx1 = 0; int len1 = vchars1.length;
        int idx2 = 0; int len2 = vchars2.length;
        while(true){
            int curV1 = 0;
            int curV2 = 0;
            while(idx1<len1 && vchars1[idx1]!= '.'){
                curV1 += curV1 * 10 + (vchars1[idx1]-48);
                idx1++;
            }
            while(idx2<len2 && vchars2[idx2]!= '.'){
                curV2 += curV2 * 10 + (vchars2[idx2]-48);
                idx2++;
            }
            idx1++;
            idx2++;

            if (curV1 > curV2)
                return 1;
            else if (curV1 < curV2)
                return -1;

            if (idx1 >= len1) return 0;
        }
    }
}
