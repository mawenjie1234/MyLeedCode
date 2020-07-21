//package com.company.leetcode.editor.cn;//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
////
//// 假设一个二叉搜索树具有如下特征：
////
////
//// 节点的左子树只包含小于当前节点的数。
//// 节点的右子树只包含大于当前节点的数。
//// 所有左子树和右子树自身必须也是二叉搜索树。
////
////
//// 示例 1:
////
//// 输入:
////    2
////   / \
////  1   3
////输出: true
////
////
//// 示例 2:
////
//// 输入:
////    5
////   / \
////  1   4
////     / \
////    3   6
////输出: false
////解释: 输入为: [5,1,4,null,null,3,6]。
////     根节点的值为 5 ，但是其右子节点值为 4 。
////
//// Related Topics 树 深度优先搜索
//// 👍 671 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.sql.Struct;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// * int val;
// * TreeNode left;
// * TreeNode right;
// * TreeNode(int x) { val = x; }
// * }
// */
//class Solution {
//
////    public class TreeNode {
////        int val;
////        TreeNode left;
////        TreeNode right;
////
////        TreeNode(int x) {
////            val = x;
////        }
////    }
//
//    public boolean isValidBST(TreeNode root) {
//        if(root == null) {
//            return true;
//        }
//        return helper(root, null, null);
//    }
//
//    private boolean helper(TreeNode root, Integer low, Integer up) {
//        // terminal
//        if(root == null) {
//            return true;
//        }
//        // current
//        if(low != null && root.val  <= low) return false;
//        if(up != null && root.val >= up) return false;
//
//        // down
//        return helper(root.left, low, root.val) && helper(root.right, root.val, up);
//        // state
//    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
