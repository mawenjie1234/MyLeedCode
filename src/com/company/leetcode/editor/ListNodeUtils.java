//package com.company.leetcode.editor;
//
//
//public class ListNodeUtils {
//
//        public static void main(String[] args) {
//        ListNode last = null;
//        ListNode head = null;
//        int createCount = 10;
//        for (int i = 0; i < createCount; i++) {
//            last = Create(i, last);
//            if (createCount == i + 1) {
//                head = last;
//            }
//        }
//        printListNode(head);
//
//        Solution solution = new Solution();
//        solution.deleteDuplicates(head);
//
//        System.out.println("reverse finished");
//        printListNode(head);
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
//    private static ListNode Create(int value, ListNode next) {
//        return new ListNode(value, next);
//    }
//
//    public static class ListNode {
//        public int val;
//        public ListNode next;
//
//        ListNode(int x, ListNode next) {
//            val = x;
//            this.next = next;
//        }
//    }
//}
