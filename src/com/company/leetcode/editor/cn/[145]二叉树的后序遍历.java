//package com.company.leetcode.editor.cn;//给定一个二叉树，返回它的 后序 遍历。
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
////输出: [3,2,1]
////
//// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
//// Related Topics 栈 树
//// 👍 478 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// * int val;
// * TreeNode left;
// * TreeNode right;
// * TreeNode() {}
// * TreeNode(int val) { this.val = val; }
// * TreeNode(int val, TreeNode left, TreeNode right) {
// * this.val = val;
// * this.left = left;
// * this.right = right;
// * }
// * }
// */
//class Solution {
//
////    public static class TreeNode {
////        int val;
////        TreeNode left;
////        TreeNode right;
////
////        TreeNode(int val) {
////            this.val = val;
////        }
////
////        TreeNode(int val, TreeNode left, TreeNode right) {
////            this.val = val;
////            this.left = left;
////            this.right = right;
////        }
////    }
////
////    public static void main(String[] args) {
////        TreeNode node1 = new TreeNode(1);
////        TreeNode node2 = new TreeNode(2);
////        TreeNode node3 = new TreeNode(3);
////        node1.right = node2;
////        node2.left = node3;
////        List<Integer> res = new Solution().postorderTraversal(node1);
////        for (int i = 0; i < res.size(); i++) {
////            System.out.print(res.get(i));
////            System.out.print(",");
////        }
////    }
//
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root,res);
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
//        if(node.right != null) {
//            helper(node.right, res);
//        }
//        res.add(node.val);
//    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
