package noreason.me.leetcode.algorithms;

import noreason.me.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created on 2016-07-16
 *
 * @author: MSK
 * @description:
 */
public class _107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null) return null;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        while(true){
            List<Integer> level = new ArrayList<Integer>();
            Stack<TreeNode> nextLevel = new Stack<TreeNode>();
            while (!s.empty()){
                TreeNode node = s.pop();
                level.add(node.val);
                if (node.right!=null) nextLevel.push(node.right);
                if (node.left!=null) nextLevel.push(node.left);
            }
            s = nextLevel;
            result.add(0,level);
            if (s.size()==0) break;
        }
        return result;
    }
}
