//package com.company.leetcode.editor.cn;//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
////
//// 示例 1:
////
//// 输入: 1->1->2
////输出: 1->2
////
////
//// 示例 2:
////
//// 输入: 1->1->2->3->3
////输出: 1->2->3
//// Related Topics 链表
//// 👍 345 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//
//import java.util.HashSet;
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
////        solution.deleteDuplicates(head);
////
////        System.out.println("reverse finished");
////        printListNode(head);
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
////        public int val;
////        public ListNode next;
////
////        ListNode(int x, ListNode next) {
////            val = x;
////            this.next = next;
////        }
////    }
//
//
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode iterator = head;
//        while (iterator!= null && iterator.next != null) {
//            if(iterator.val == iterator.next.val) {
//                iterator.next = iterator.next.next;
//            }else {
//                iterator = iterator.next;
//            }
//        }
//        return head;
//    }
//
//
////    public ListNode deleteDuplicates(ListNode head) {
////        HashSet<Integer> set = new HashSet<>();
////        ListNode iterator = head;
////        ListNode last = null;
////        while (iterator!= null) {
////            if(!set.contains(iterator.val)) {
////                set.add(iterator.val);
////                last = iterator;
////            }else {
////                ListNode thread = iterator.next;
////                last.next = thread;
////            }
////            iterator = iterator.next;
////        }
////        return head;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
