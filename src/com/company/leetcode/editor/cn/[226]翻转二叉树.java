//package com.company.leetcode.editor.cn;
////翻转一棵二叉树。
////
//// 示例：
////
//// 输入：
////
////      4
////   /   \
////  2     7
//// / \   / \
////1   3 6   9
////
//// 输出：
////
////      4
////   /   \
////  7     2
//// / \   / \
////9   6 3   1
////
//// 备注:
////这个问题是受到 Max Howell 的 原问题 启发的 ：
////
//// 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
//// Related Topics 树
//// 👍 503 👎 0
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
////    public static class TreeNode {
////        int val;
////        TreeNode left;
////        TreeNode right;
////
////        TreeNode(int x) {
////            val = x;
////        }
////    }
////
////    public static void main(String[] args) {
////        TreeNode r31 = new TreeNode(1);
////        TreeNode r32 = new TreeNode(3);
////        TreeNode r33 = new TreeNode(6);
////        TreeNode r34 = new TreeNode(9);
////
////        TreeNode r21 = new TreeNode(2);
////        r21.left = r31;
////        r21.right = r32;
////
////        TreeNode r22 = new TreeNode(7);
////        r22.left = r33;
////        r22.right = r34;
////
////        TreeNode root = new TreeNode(1);
////
////        root.left = r21;
////        root.right = r22;
////
////        TreeNode res = new Solution().invertTree(root);
////
////        System.out.println();
////    }
//
//    public TreeNode invertTree(TreeNode root) {
//        helper(root);
//        return root;
//    }
//
//    private void helper(TreeNode root) {
//        if(root == null) {
//            return;
//        }
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//
//        helper(root.left);
//        helper(root.right);
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
