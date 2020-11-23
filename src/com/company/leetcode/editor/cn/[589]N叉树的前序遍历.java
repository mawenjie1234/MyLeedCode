//package com.company.leetcode.editor.cn;
////给定一个 N 叉树，返回其节点值的前序遍历。
////
//// 例如，给定一个 3叉树 :
////
////
////
////
////
////
////
//// 返回其前序遍历: [1,3,5,6,2,4]。
////
////
////
//// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树
//// 👍 89 👎 0
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
//import java.util.Collections;
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
//    public List<Integer> preorder(Node root) {
//        LinkedList<Integer> res = new LinkedList<>();
//        if (root == null) {
//            return res;
//        }
//        LinkedList<Node> stack = new LinkedList<>();
//        stack.add(root);
//        while (!stack.isEmpty()) {
//            Node temp = stack.getFirst();
//            res.add(temp.val);
//            for (int i = temp.children.size() - 1; i >=0; i--) {
//                stack.addFirst(temp.children.get(i));
//            }
//        }
//        return res;
//    }
//
//
////    public List<Integer> preorder(Node root) {
////        List<Integer> res = new ArrayList<>();
////        if(root == null) {
////            return res;
////        }
////        LinkedList<Node> stack = new LinkedList<>();
////        stack.add(root);
////        while (!stack.isEmpty()) {
////            Node node = stack.pollLast();
////            res.add(node.val);
////            Collections.reverse(node.children);
////            stack.addAll(node.children);
////        }
////        return res;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
