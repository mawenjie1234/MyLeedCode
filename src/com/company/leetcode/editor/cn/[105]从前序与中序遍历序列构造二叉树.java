//package com.company.leetcode.editor.cn;
////根据一棵树的前序遍历与中序遍历构造二叉树。
////
//// 注意:
////你可以假设树中没有重复的元素。
////
//// 例如，给出
////
//// 前序遍历 preorder = [3,9,20,15,7]
////中序遍历 inorder = [9,3,15,20,7]
////
//// 返回如下的二叉树：
////
////     3
////   / \
////  9  20
////    /  \
////   15   7
//// Related Topics 树 深度优先搜索 数组
//// 👍 578 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.HashMap;
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
////
////    public static void main(String[] args) {
////        int[] pre = {3,9,20,15,7};
////        int[] in = {9,3,15,20,7};
////        TreeNode root = new Solution().buildTree(pre, in);
////        System.out.println();
////    }
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        HashMap<Integer, Integer> inorderMap = new HashMap<>();
//        int size = preorder.length;
//        for (int i = 0; i < size; i++) {
//            inorderMap.put(inorder[i], i);
//        }
//        return helper(preorder, 0, size - 1, inorderMap, 0, size - 1);
//    }
//
//    /**
//     * @param preorder [root, [left], [right]]
//     *                 inorder  [[left], root, [right]]
//     * @return
//     */
//    private TreeNode helper(int[] preorder, int preLeft, int preRight,
//                            HashMap<Integer, Integer> inorderMap, int inLeft, int inRight) {
//        if (preLeft > preRight) {
//            return null;
//        }
//        // progress
//        TreeNode root = new TreeNode(preorder[preLeft]);
//        int inOrderIndex = inorderMap.get(root.val);
//        int leftSize = inOrderIndex - inLeft;
//
//        //down
//        root.left = helper(preorder, preLeft+1, preLeft + leftSize, inorderMap, inLeft, inOrderIndex - 1);
//        root.right = helper(preorder, preLeft + leftSize + 1, preRight, inorderMap, inOrderIndex + 1, inRight);
//        // re- state
//        return root;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
