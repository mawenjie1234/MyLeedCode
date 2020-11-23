//package com.company.leetcode.editor.cn;
////给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
////
//// 例如，给定一个 3叉树 :
////
////
////
////
////
////
////
//// 返回其层序遍历:
////
//// [
////     [1],
////     [3,2,4],
////     [5,6]
////]
////
////
////
////
//// 说明:
////
////
//// 树的深度不会超过 1000。
//// 树的节点总数不会超过 5000。
//// Related Topics 树 广度优先搜索
//// 👍 98 👎 0
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
//    static class Node {
//        public int val;
//        public List<Node> children;
//
//        public Node() {
//        }
//
//        public Node(int _val) {
//            val = _val;
//            children = new ArrayList<>();
//        }
//
//        public Node(int _val, List<Node> _children) {
//            val = _val;
//            children = _children;
//        }
//
//        public Node add(Node node) {
//            children.add(node);
//            return this;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node root = new Node(1);
//
//        Node row21 = new Node(2);
//        Node row22 = new Node(3);
//        Node row23 = new Node(4);
//
//        root.add(row21).add(row22).add(row23);
//
//        Node row31 = new Node(5);
//        Node row32 = new Node(6);
//        Node row33 = new Node(7);
//        row21.add(row31).add(row32);
//
//        row22.add(row33);
//
//        List<List<Integer>> res = new Solution().levelOrder(root);
//        for (List<Integer> list : res) {
//            for (Integer value : list) {
//                System.out.print(value + ", ");
//            }
//            System.out.println();
//        }
//    }
//
////    public List<List<Integer>> levelOrder(Node root) {
////        List<List<Integer>> res = new ArrayList<>();
////        if(root == null) {
////            return res;
////        }
////        LinkedList<Node> level = new LinkedList<>();
////        level.addFirst(root);
////        while (!level.isEmpty()) {
////            int size = level.size();
////            List<Integer> levelRes = new ArrayList<>();
////            for (int i = 0; i < size; i++) {
////                Node temp = level.pollFirst();
////                if(temp != null) {
////                    levelRes.add(temp.val);
////                    level.addAll(temp.children);
////                }
////            }
////            res.add(levelRes);
////        }
////        return res;
////    }
//
//
////    public List<List<Integer>> levelOrder(Node root) {
////        List<List<Integer>> res = new ArrayList<>();
////        if (root == null) {
////            return res;
////        }
////        LinkedList<Node> queue = new LinkedList<>();
////        queue.add(root);
////        while (!queue.isEmpty()) {
////            int size = queue.size();
////            List<Integer> rowRes = new ArrayList<>(size);
////            for (int i = 0; i < size; i++) {
////                Node temp = queue.pollFirst();
////                if(temp != null) {
////                    rowRes.add(temp.val);
////                    queue.addAll(temp.children);
////                }
////            }
////            res.add(rowRes);
////        }
////        return res;
////    }
//
//
////    public List<List<Integer>> levelOrder(Node root) {
////        if(root == null) {
////            return new ArrayList<>();
////        }
////        List<List<Integer>> res = new ArrayList<>();
////        List<Node> lastRow = new ArrayList<>();
////        lastRow.add(root);
////        helper(lastRow, res);
////        return res;
////    }
////
////    private List<Node> helper(List<Node> lastRow, List<List<Integer>> res) {
////        List<Node> nextRow = new ArrayList<>();
////        List<Integer> currentRes = new ArrayList<>();
////        for (Node node : lastRow) {
////            if(node != null) {
////                currentRes.add(node.val);
////                nextRow.addAll(node.children);
////            }
////        }
////        res.add(currentRes);
////        if(nextRow.size() > 0) {
////            helper(nextRow, res);
////        }
////        return nextRow;
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
