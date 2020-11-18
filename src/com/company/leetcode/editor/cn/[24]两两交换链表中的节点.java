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
//    public class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
//    }
//
//    public static void main (String[] args) {
//
//    }
//    public ListNode swapPairs(ListNode head) {
//
//    }
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
