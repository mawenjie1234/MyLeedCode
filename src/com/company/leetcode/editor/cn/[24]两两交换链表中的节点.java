//package com.company.leetcode.editor.cn;
////给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
////
//// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
////
////
////
//// 示例:
////
//// 给定 1->2->3->4, 你应该返回 2->1->4->3.
////
//// Related Topics 链表
//
//
////leetcode submit region begin(Prohibit modification and deletion)
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//
///*
//    给定 1->2->3->4, 你应该返回 2->1->4->3.
// */
//
//class Solution {
//
//    public static class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
//    }
//
//    public static void main (String[] args) {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//
//        ListNode res = new Solution().swapPairs(node1);
//        while (res != null) {
//            System.out.print(res.val);
//            System.out.print("->");
//            res = res.next;
//        }
//    }
//
//    public ListNode swapPairs(ListNode head) {
//
//    }
//
//
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode res = head.next;
////        ListNode current = head;
////        ListNode pre = null;
////
////        while (current != null || current.next != null) { // 3
////            ListNode next = current.next; // 4
////            ListNode third = next.next; // 5
////            current.next = third;
////            next.next = current;
////            current = third;
////            if(pre != null) {
////                pre.next = next;
////            }
////            pre = next.next;
////        }
////
////        return res;
////    }
//
//
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode res = head.next;
////
////        ListNode current = head;
////        ListNode pre = null;
////
////        while (current != null && current.next != null) {
////            // current 3
////            ListNode next = current.next; // 4
////            ListNode third = next.next; // 5
////            current.next = third; // 3.next = 5
////            next.next = current; // 4.next = 3
////            current = third;
////            if(pre != null) {
////                pre.next = next;
////            }
////            pre = next.next;
////        }
////
////        return res;
////    }
//
//
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode res = head.next;
////
////        ListNode current = head;
////        ListNode pre = null;
////        while (current != null && current.next != null) {
////            ListNode next = current.next; // 4
////            ListNode third = next.next; // 5
////            current.next = third;
////            current = third;
////
////            if(pre != null) {
////                pre.next = next;
////            }
////            pre = next.next;
////        }
////
////        return res;
////    }
//
//
//
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode res = head.next;
////
////        ListNode pre = null;
////        ListNode cur = head;
////        while (cur != null && cur.next != null) {
////            ListNode next = cur.next;
////            ListNode third = next.next;
////            cur.next = third;
////            cur = third;
////            if(pre != null) {
////                pre.next = next;
////            }
////            pre = next.next;
////        }
////
////        return head;
////    }
//
//
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode res = head.next;
////
////        ListNode pre = null;
////        ListNode current = head;
////        while (current != null && current.next != null) {
////            ListNode next = current.next;
////            ListNode temp = next.next;
////            current.next = temp;
////            current = temp;
////            if(pre != null) {
////                pre.next = next;
////            }
////            pre = next.next;
////        }
////        return res;
////    }
//
//
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode first = head.next;
////        ListNode current = head;
////        ListNode pre = null;
////        while (current!= null && current.next != null) {
////            ListNode next = current.next;
////            ListNode thread = current.next.next;
////            current.next = thread;
////            next.next = current;
////            current = thread;
////            if(pre != null) {
////                pre.next = next;
////            }
////            pre = next.next;
////        }
////        return first;
////    }
//
//
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode first = head.next;
////        while (head != null && head.next != null) {
////            ListNode next = head.next;
////            ListNode thread = head.next.next;
////            next.next = head;
////            head.next = thread;
////            head = thread;
////        }
////        return first;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
