//package com.company.leetcode.editor.cn;
////反转一个单链表。
////
//// 示例:
////
//// 输入: 1->2->3->4->5->NULL
////输出: 5->4->3->2->1->NULL
////
//// 进阶:
////你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
//// Related Topics 链表
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.List;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode(int x) { val = x; }
// * }
// */
//
/////反转一个单链表。
////
////示例:
////
////输入: 1->2->3->4->5->NULL
////输出: 5->4->3->2->1->NULL
////进阶:
////你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
//class Solution {
//
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null) {
//            return head;
//        }
//        ListNode pre = null;
//        while (head != null) {
//            ListNode temp = head.next;
//            head.next = pre;
//            pre = head;
//            head = temp;
//        }
//        return pre;
//    }
//
//
////    public ListNode reverseList(ListNode head) {
////        if(head == null || head.next == null) {
////            return head;
////        }
////        ListNode pre = null;
////        while (head != null) {
////            ListNode temp = head.next;
////            head.next = pre;
////            pre = head;
////            head = temp;
////        }
////        return pre;
////    }
//
//
//
////    public ListNode reverseList(ListNode head) {
////        if (head == null || head.next == null) {
////            return head;
////        }
////        ListNode pre = null;
////        while (head != null) {
////            ListNode temp = head.next;
////            head.next = pre;
////            pre = head;
////            head = temp;
////        }
////        return pre;
////    }
//
//
////    public ListNode reverseList(ListNode head) {
////        ListNode pre = null;
////        ListNode current = head;
////        while (current != null) {
////            ListNode next = current.next;
////            current.next = pre;
////            pre = current;
////            current = next;
////        }
////        return pre;
////    }
//
//
////    public ListNode reverseList(ListNode head) {
////        ListNode pre = null;
////        ListNode current = head;
////        while (current != null) {
////            ListNode temp = current.next;
////            current.next = pre;
////            pre = current;
////            current = temp;
////        }
////        return pre;
////    }
//
//
////    public ListNode reverseList(ListNode head) {
////         ListNode pre = head;
////         ListNode current  = head;
////         while (current != null) {
////             ListNode temp = current.next;
////             current.next = pre;
////             pre = current;
////             current = temp;
////         }
////         return pre;
////    }
//
//    // 3
////    public ListNode reverseList(ListNode head) {
////        ListNode pre = null;
////        ListNode current = head;
////        while (current != null) {
////            ListNode temp = current.next;
////            current.next = pre;
////            pre = current;
////            current = temp;
////        }
////        return pre;
////    }
//
//
////    public ListNode reverseList(ListNode head) {
////        ListNode pre = null;
////        ListNode current = head;
////        while (current != null) {
////            ListNode nextTemp = current.next;
////            current.next = pre;
////            pre = current;
////            current = nextTemp;
////        }
////        return pre;
////    }
//}
//
//
////    public ListNode reverseList(ListNode head) {
////        ListNode pre = null;
////        ListNode current = head;
////        while (current != null) {
////            ListNode nextTemp = current.next;
////            current.next = pre;
////            pre = current;
////            current = nextTemp;
////        }
////        return pre;
////    }
////}
////leetcode submit region end(Prohibit modification and deletion)
