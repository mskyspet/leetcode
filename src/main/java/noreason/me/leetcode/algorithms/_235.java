package noreason.me.leetcode.algorithms;

import com.sun.javafx.runtime.SystemProperties;
import noreason.me.leetcode.common.TreeNode;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created on 2016-07-16
 *
 * @author: MSK
 * @description:
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 *
 * _______6______
 * /              \
 * ___2__          ___8__
 * /      \        /      \
 * 0      _4       7       9
 * /  \
 * 3   5
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */
public class _235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*
          注意是二叉查找树, 已排序
         */
        if (root==null) return null;
        while (root != null){
            if (root.val >= p.val && root.val <= q.val) return root;
            if (root.val <= p.val && root.val >= q.val) return root;
            if (p.val > root.val) root = root.right;
            else root = root.left;
        }
        return null;

    }

}
