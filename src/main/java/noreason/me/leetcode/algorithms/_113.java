package noreason.me.leetcode.algorithms;

import noreason.me.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created on 2016-07-17
 *
 * @author: MSK
 * @description:
 */
public class _113 {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    private List<Integer> stack = new ArrayList<Integer>();

    public void findPath(TreeNode root, int sum) {
        stack.add(root.val);
        try {
            if (root.left == null && root.right == null) {
                if (root.val == sum) {
                    List<Integer> thisResult = new ArrayList<Integer>(stack.size());
                    thisResult.addAll(stack);
                    result.add(thisResult);
                }
                return;
            }
            if (root.left!=null) findPath(root.left, sum-root.val);
            if (root.right!=null) findPath(root.right, sum-root.val);
        } finally {
            stack.remove(stack.size()-1);
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return result;
        findPath(root, sum);
        return result;
    }
}
