package noreason.me.leetcode.algorithms;

import noreason.me.leetcode.common.ListNode;
import org.junit.Test;

import java.util.Stack;

/**
 * Created on 2016-07-17
 *
 * @author: MSK
 * @description:
 */
public class _234 {
    public boolean isPalindrome(ListNode head) {
        if (head==null) return true;
        if (head.next==null) return true;
        Stack<Integer> s = new Stack<Integer>();
        // 暂不考虑O(1)空间

        //快慢指针 找到中间节点
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            s.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // 奇数个
        if (fast!=null) slow = slow.next;

        // 开始对比
        while(!s.empty()) {
            int v = (int)s.pop();
            if (v!=slow.val) return false;
            slow = slow.next;
        }
        char[] result = new char[10];
        return true;
    }

    @Test
    public void Test(){
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);
        head.next=first;
        first.next = second;
        System.out.println(isPalindrome(head));
    }
}
