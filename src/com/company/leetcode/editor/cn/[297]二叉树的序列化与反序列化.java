//package com.company.leetcode.editor.cn;
////序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方
////式重构得到原数据。
////
//// 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串
////反序列化为原始的树结构。
////
//// 示例:
////
//// 你可以将以下二叉树：
////
////    1
////   / \
////  2   3
////     / \
////    4   5
////
////序列化为 "[1,2,3,null,null,4,5]"
////
//// 提示: 这与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这
////个问题。
////
//// 说明: 不要使用类的成员 / 全局 / 静态变量来存储状态，你的序列化和反序列化算法应该是无状态的。
//// Related Topics 树 设计
//// 👍 319 👎 0
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
//class Codec {
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
//////        String nodes = "1,2,3,null,null,4,5";
////        String nodes = "null";
////
////        TreeNode treeNode = new Codec().deserialize(nodes);
////        System.out.println();
////    }
//
//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        StringBuilder res = new StringBuilder();
//        stack.add(root);
//        while (!stack.isEmpty()) {
//            TreeNode temp = stack.pollFirst();
//            if(temp == null) {
//                res.append("null");
//            }else {
//                res.append(temp.val);
//                stack.addLast(temp.left);
//                stack.addLast(temp.right);
//            }
//            if(!stack.isEmpty()) {
//                res.append(",");
//            }
//        }
////        res.append("]");
//        return res.toString();
//
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        if(data == null || data.isEmpty() || data.equals("null")) {
//            return null;
//        }
//        String[] nodes = data.split(",");
//        if(nodes.length == 0) {
//            return null;
//        }
//        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
//        LinkedList<TreeNode> current = new LinkedList<>();
//        current.addLast(root);
//        helper(nodes, current, 1);
//        return root;
//    }
//
//    private void helper(String[] source, LinkedList<TreeNode> lastLine, int index) {
//        if(index >= source.length || lastLine == null || lastLine.isEmpty()) {
//            return;
//        }
//        LinkedList<TreeNode> nextLine = new LinkedList<>();
//        int currentIndex = index;
//        while (!lastLine.isEmpty()) {
//            TreeNode temp = lastLine.pollFirst();
//            TreeNode left = createNode(source, currentIndex++);
//            TreeNode right = createNode(source, currentIndex++);
//            temp.left = left;
//            temp.right = right;
//            if(left != null) {
//                nextLine.addLast(left);
//            }
//            if(right != null) {
//                nextLine.addLast(right);
//            }
//        }
//        helper(source, nextLine, currentIndex);
//    }
//
//    private TreeNode createNode(String[] source, int index) {
//        if(index >= source.length) {
//            return null;
//        }
//        String value = source[index];
//        if(value.equals("null")) {
//            return null;
//        }else {
//            return new TreeNode(Integer.parseInt(value));
//        }
//    }
//}
//
//// Your Codec object will be instantiated and called as such:
//// Codec codec = new Codec();
//// codec.deserialize(codec.serialize(root));
////leetcode submit region end(Prohibit modification and deletion)
