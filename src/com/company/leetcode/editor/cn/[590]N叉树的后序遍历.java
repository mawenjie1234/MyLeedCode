//package com.company.leetcode.editor.cn;
////给定一个 N 叉树，返回其节点值的后序遍历。
////
//// 例如，给定一个 3叉树 :
////
////
////
////
////
////
////
//// 返回其后序遍历: [5,6,3,2,4,1].
////
////
////
//// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树
//// 👍 85 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
///*
//// Definition for a Node.
//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};
//*/
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//class Solution {
//
//    class Node {
//        public int val;
//        public List<Node> children;
//
//        public Node() {
//        }
//
//        public Node(int _val) {
//            val = _val;
//        }
//
//        public Node(int _val, List<Node> _children) {
//            val = _val;
//            children = _children;
//        }
//    }
//
//    ;
//
//    public List<Integer> postorder(Node root) {
//        LinkedList<Integer> res = new LinkedList<>();
//        if(root == null) {
//            return res;
//        }
//        LinkedList<Node> stack = new LinkedList<>();
//        stack.addFirst(root);
//        while (!stack.isEmpty()) {
//            Node temp = stack.peekLast();
//            res.addFirst(temp.val);
//            for (Node child : temp.children) {
//                if(child != null) {
//                    stack.addLast(child);
//                }
//            }
//        }
//
//        return res;
//    }
//
////    public List<Integer> postorder(Node root) {
////        LinkedList<Integer> res = new LinkedList<>();
////        if(root == null) {
////            return res;
////        }
////
////        LinkedList<Node> stack = new LinkedList<>();
////        stack.add(root);
////        while (!stack.isEmpty()) {
////            Node node = stack.pollLast();
////            res.addFirst(node.val);
////            for (Node child : node.children) {
////                if(child != null) {
////                    stack.add(child);
////                }
////            }
////        }
////        return res;
////    }
//
//
////    public List<Integer> postorder(Node root) {
////        List<Integer> res = new ArrayList<>();
////        helper(root, res);
////        return res;
////    }
////
////    private void helper(Node root, List<Integer> res) {
////        if(root == null) {
////            return;
////        }
////        if(root.children != null) {
////            for (Node node: root.children) {
////                helper(node, res);
////            }
////        }
////        res.add(root.val);
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
