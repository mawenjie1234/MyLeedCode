//package com.company.leetcode.editor.cn;
////您需要在二叉树的每一行中找到最大的值。
////
//// 示例：
////
////
////输入:
////
////          1
////         / \
////        3   2
////       / \   \
////      5   3   9
////
////输出: [1, 3, 9]
////
//// Related Topics 树 深度优先搜索 广度优先搜索
//// 👍 81 👎 0
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
//    public List<Integer> largestValues(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        if(root == null) {
//            return res;
//        }
//        LinkedList<TreeNode> current = new LinkedList<>();
//        current.add(root);
//        while (current.size() > 0) {
//            int size = current.size();
//            int maxValue = current.getFirst().val;
//            for (int i = 0; i < size; i++) {
//                TreeNode temp = current.pollFirst();
//                maxValue = Math.max(maxValue, temp.val);
//                if(temp.left != null) {
//                    current.add(temp.left);
//                }
//                if(temp.right != null) {
//                    current.add(temp.right);
//                }
//            }
//            res.add(maxValue);
//        }
//        return res;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
