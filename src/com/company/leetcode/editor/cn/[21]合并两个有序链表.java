//package com.company.leetcode.editor.cn;//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
////
////
////
//// 示例：
////
//// 输入：1->2->4, 1->3->4
////输出：1->1->2->3->4->4
////
//// Related Topics 链表
//// 👍 1152 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode() {}
// * ListNode(int val) { this.val = val; }
// * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//
//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {
//        }
//        ListNode(int val) {
//            this.val = val;
//        }
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//
//    public static void main(String[] args) {
//        ListNode l1 = CreateNodes(2);
//        printListNode(l1);
//        ListNode l2 = CreateNodes(3);
//        printListNode(l2);
//        printListNode(new Solution().mergeTwoLists(l1, l2));
//    }
//
//    private static ListNode CreateNodes(int multiple) {
//        ListNode last = null;
//        ListNode head = null;
//        int createCount = 5;
//        Solution solution = new Solution();
//        for (int i = 0; i < createCount; i++) {
//            last = solution.Create(multiple * (createCount - i), last);
//            if (createCount == i + 1) {
//                head = last;
//            }
//        }
//        return head;
//    }
//
//    private static void printListNode(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val);
//            head = head.next;
//            if (head != null) {
//                System.out.print("->");
//            } else {
//                System.out.println();
//            }
//        }
//    }
//
//    private ListNode Create(int value, ListNode next) {
//        return new ListNode(value, next);
//    }
//
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//        ListNode first = new ListNode(-1);
//
//        ListNode current = first;
//
//        while (l1 != null && l2 != null) {
//            if(l1.val < l2.val) {
//                current.next = l1;
//                l1 = l1.next;
//            }else {
//                current.next = l2;
//                l2 = l2.next;
//            }
//            current = current.next;
//        }
//        current.next = l1 == null ? l2 : l1;
//        return first.next;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
