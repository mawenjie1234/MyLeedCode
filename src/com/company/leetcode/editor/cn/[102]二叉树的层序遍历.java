//package com.company.leetcode.editor.cn;
////给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
////
////
////
//// 示例：
////二叉树：[3,9,20,null,null,15,7],
////
////     3
////   / \
////  9  20
////    /  \
////   15   7
////
////
//// 返回其层次遍历结果：
////
//// [
////  [3],
////  [9,20],
////  [15,7]
////]
////
//// Related Topics 树 广度优先搜索
//// 👍 575 👎 0
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
//    //    public List<List<Integer>> levelOrder(TreeNode root) {
////
////    }
//
////    public List<List<Integer>> levelOrder(TreeNode root) {
////        List<List<Integer>> res = new ArrayList<>();
////        if(root == null) {
////            return res;
////        }
////        LinkedList<TreeNode> linkedList = new LinkedList<>();
////        linkedList.add(root);
////        while (!linkedList.isEmpty()) {
////            List<Integer> level = new ArrayList<>();
////            int size = linkedList.size();
////            for (int i = 0; i < size; i++) {
////                TreeNode node = linkedList.pollFirst();
////                if(node == null) {
////                    continue;
////                }
////                level.add(node.val);
////                if(node.left != null) {
////                    linkedList.add(node.left);
////                }
////                if(node.right != null) {
////                    linkedList.add(node.right);
////                }
////            }
////            res.add(level);
////        }
////        return res;
////    }
//
////    public List<List<Integer>> levelOrder(TreeNode root) {
////        List<List<Integer>> res = new ArrayList<>();
////        if(root == null) {
////            return res;
////        }
////        LinkedList<TreeNode> current = new LinkedList<>();
////        current.add(root);
////        while (current.size() > 0) {
////            int size = current.size();
////            List<Integer> resRow = new ArrayList<>(size);
////            for (int i = 0; i < size; i++) {
////                TreeNode temp = current.pollFirst();
////                if(temp != null) {
////                    resRow.add(temp.val);
////                    if(temp.left != null) {
////                        current.add(temp.left);
////                    }
////                    if(temp.right != null) {
////                        current.add(temp.right);
////                    }
////                }
////            }
////            res.add(resRow);
////        }
////        return res;
////    }
//
//
////    public List<List<Integer>> levelOrder(TreeNode root) {
////        List<List<Integer>> res = new ArrayList<>();
////        if (root == null) {
////            return res;
////        }
////        LinkedList<TreeNode> current = new LinkedList<>();
////        current.add(root);
////        helper(res, current);
////        return res;
////    }
////
////    private void helper(List<List<Integer>> res, List<TreeNode> current) {
////        if (current == null || current.size() == 0) {
////            return;
////        }
////        List<TreeNode> next = new LinkedList<>();
////        List<Integer> value = new ArrayList<>(current.size());
////        for (TreeNode node : current) {
////            value.add(node.val);
////            if (node.left != null) {
////                next.add(node.left);
////            }
////            if (node.right != null) {
////                next.add(node.right);
////            }
////        }
////        res.add(value);
////        helper(res, next);
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
