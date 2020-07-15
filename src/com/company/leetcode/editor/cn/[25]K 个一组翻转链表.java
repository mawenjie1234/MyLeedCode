//package com.company.leetcode.editor.cn;//给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
////
//// k 是一个正整数，它的值小于或等于链表的长度。
////
//// 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
////
////
////
//// 示例：
////
//// 给你这个链表：1->2->3->4->5
////
//// 当 k = 2 时，应当返回: 2->1->4->3->5
////
//// 当 k = 3 时，应当返回: 3->2->1->4->5
////
////
////
//// 说明：
////
////
//// 你的算法只能使用常数的额外空间。
//// 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
////
//// Related Topics 链表
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.Deque;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//
////    public static void main(String[] args) {
////        ListNode last = null;
////        ListNode head = null;
////        int createCount = 10;
////        for (int i = 0; i < createCount; i++) {
////            last = Create(i, last);
////            if (createCount == i + 1) {
////                head = last;
////            }
////        }
////        printListNode(head);
////
////        Solution solution = new Solution();
////        ListNode k = solution.reverseKGroup(head, 4);
////
////        System.out.println("reverse finished");
////        printListNode(k);
////    }
////
////    private static void printListNode(ListNode head) {
////        while (head != null) {
////            System.out.print(head.val);
////            head = head.next;
////            if (head != null) {
////                System.out.print("->");
////            } else {
////                System.out.println();
////            }
////        }
////    }
////
////    private static ListNode Create(int value, ListNode next) {
////        return new ListNode(value, next);
////    }
////
////    public static class ListNode {
////        int val;
////        ListNode next;
////
////        ListNode(int x, ListNode next) {
////            val = x;
////            this.next = next;
////        }
////    }
//
//
//    // 1
//
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if(k == 1) {
//            return head;
//        }
//        int count = 1;
//        ListNode iterator = head;
//        ListNode reverseFinishedHeader = null;
//        ListNode start = head;
//        ListNode pre = null;
//        while (iterator != null && iterator.next != null) {
//            iterator = iterator.next;
//            count++;
//            if (count == k) {
//                count = 0;
//                ListNode end = iterator;
//                reverse(start, k);
//                // end 在前，start 在后
//                if(pre != null) {
//                    pre.next = end;
//                }
//                pre = start;
//                if(reverseFinishedHeader == null) {
//                    reverseFinishedHeader = end;
//                }
//                iterator = start;
//                start = start.next;
//
//                //printListNode(reverseFinishedHeader);
//            }
//        }
//        return reverseFinishedHeader;
//    }
//
//    private void reverse(ListNode head, int count) {
//        if (head == null) {
//            return;
//        }
//        int reverseCount = 1;
//        ListNode first = head;
//        ListNode next = null;
//        while (reverseCount < count && head.next != null) {
//            reverseCount++;
//            next = head.next;
//            ListNode thread = next.next;
//            head.next = thread;
//            next.next = first;
//            first = next;
//            //printListNode(head);
//        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
