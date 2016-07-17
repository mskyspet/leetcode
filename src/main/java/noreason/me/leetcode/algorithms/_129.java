package noreason.me.leetcode.algorithms;

import noreason.me.leetcode.common.TreeNode;

/**
 * Created on 2016-07-17
 *
 * @author: MSK
 * @description:
 */
public class _129 {
    int sum = 0;

    public void findLeaf(TreeNode root, StringBuilder sb){
        sb.append(root.val);
        if (root.left==null&&root.right==null) {
            sum+= Integer.parseInt(sb.toString());
        }
        if (root.left!=null) findLeaf(root.left, sb);
        if (root.right!=null) findLeaf(root.right, sb);
        sb.deleteCharAt(sb.length()-1);
    }

    public int sumNumbers(TreeNode root) {
        if (root==null) return 0;
        findLeaf(root, new StringBuilder());
        return sum;
    }
}
