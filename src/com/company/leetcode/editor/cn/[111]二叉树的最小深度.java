//package com.company.leetcode.editor.cn;
////给定一个二叉树，找出其最小深度。
////
//// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
////
//// 说明: 叶子节点是指没有子节点的节点。
////
//// 示例:
////
//// 给定二叉树 [3,9,20,null,null,15,7],
////
////     3
////   / \
////  9  20
////    /  \
////   15   7
////
//// 返回它的最小深度 2.
//// Related Topics 树 深度优先搜索 广度优先搜索
//// 👍 295 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.LinkedList;
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
//    public int minDepth(TreeNode root) {
//
//    }
//
//
////    public int minDepth(TreeNode root) {
////        int count = 0;
////        if (root == null) {
////            return count;
////        }
////        LinkedList<TreeNode> queue = new LinkedList<>();
////        queue.add(root);
////        while (!queue.isEmpty()) {
////            int size = queue.size();
////            count++;
////            for (int i = 0; i < size; i++) {
////                TreeNode node = queue.remove();
////                if (node.left == null && node.right == null) {
////                    return count;
////                }
////                if (node.left != null) {
////                    queue.add(node.left);
////                }
////                if (node.right != null) {
////                    queue.add(node.right);
////                }
////            }
////        }
////        return count;
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
