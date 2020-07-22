//package com.company.leetcode.editor.cn;
////给定一个二叉树，找出其最大深度。
////
//// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
////
//// 说明: 叶子节点是指没有子节点的节点。
////
//// 示例：
////给定二叉树 [3,9,20,null,null,15,7]，
////
////     3
////   / \
////  9  20
////    /  \
////   15   7
////
//// 返回它的最大深度 3 。
//// Related Topics 树 深度优先搜索
//// 👍 611 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
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
////    public int maxDepth(TreeNode root) {
////        if(root == null) {
////            return 0;
////        }
////       return childMaxDepth(root, 0);
////    }
////
////    private int childMaxDepth(TreeNode root, int parentDepth) {
////        if(root == null) {
////            return parentDepth;
////        }
//////        if(root)
////        int leftDepth = childMaxDepth(root.left, parentDepth + 1);
////        int rightDepth = childMaxDepth(root.right, parentDepth + 1);
////        return Math.max(leftDepth, rightDepth);
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
