//package com.company.leetcode.editor.cn;
////给定一个二叉树，返回它的中序 遍历。
////
//// 示例:
////
//// 输入: [1,null,2,3]
////   1
////    \
////     2
////    /
////   3
////
////输出: [1,3,2]
////
//// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
//// Related Topics 栈 树 哈希表
//// 👍 584 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
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
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }
//
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        if(root == null) {
//            return res;
//        }
//        helper(root, res);
//        return res;
//    }
//
//    private void helper(TreeNode node, List<Integer> res) {
//        if(node == null) {
//            return;
//        }
//        if(node.left != null) {
//            helper(node.left, res);
//        }
//        res.add(node.val);
//        if(node.right != null) {
//            helper(node.right, res);
//        }
//    }
//
////    public List<Integer> inorderTraversal(TreeNode root) {
////        List<Integer> inorderRes = new ArrayList<>();
////        helper(root, inorderRes);
////        return inorderRes;
////    }
////
////    public void helper(TreeNode root, List<Integer> res) {
////        if (root == null) {
////            return;
////        }
////        if (root.left != null) {
////            helper(root.left, res);
////        }
////        res.add(root.val);
////        if (root.right != null) {
////            helper(root.right, res);
////        }
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
