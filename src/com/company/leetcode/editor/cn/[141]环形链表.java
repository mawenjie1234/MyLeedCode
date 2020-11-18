//package com.company.leetcode.editor.cn;
////给定一个链表，判断链表中是否有环。
////
//// 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
////
////
////
//// 示例 1：
////
//// 输入：head = [3,2,0,-4], pos = 1
////输出：true
////解释：链表中有一个环，其尾部连接到第二个节点。
////
////
////
////
//// 示例 2：
////
//// 输入：head = [1,2], pos = 0
////输出：true
////解释：链表中有一个环，其尾部连接到第一个节点。
////
////
////
////
//// 示例 3：
////
//// 输入：head = [1], pos = -1
////输出：false
////解释：链表中没有环。
////
////
////
////
////
////
//// 进阶：
////
//// 你能用 O(1)（即，常量）内存解决此问题吗？
//// Related Topics 链表 双指针
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.HashMap;
//import java.util.HashSet;
//
///**
// * Definition for singly-linked list.
// * class ListNode {
// * int val;
// * ListNode next;
// * ListNode(int x) {
// * val = x;
// * next = null;
// * }
// * }
// */
//class Solution {
//
//    class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//            next = null;
//        }
//    }
//
//    public boolean hasCycle(ListNode head) {
//        if(head == null) {
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while (slow != fast) {
//            slow = slow.next;
//            if(fast == null || fast.next == null) {
//                return false;
//            }
//            fast = fast.next.next;
//        }
//
//        return true;
//    }
//
//
//    //2
////    public boolean hasCycle(ListNode head) {
////        if(head == null) {
////            return false;
////        }
////        ListNode slow = head;
////        ListNode fast = head.next;
////        while (slow != fast) {
////            if(fast == null || fast.next == null) {
////                return false;
////            }
////            slow = slow.next;
////            fast = fast.next.next;
////        }
////
////        return true;
////    }
//
//
////    public boolean hasCycle(ListNode head) {
////        HashSet<ListNode> set = new HashSet<>();
////        while (head != null) {
////            if(set.contains(head)) {
////                return true;
////            }
////            set.add(head);
////            head = head.next;
////        }
////        return false;
////    }
//
//
////    public boolean hasCycle(ListNode head) {
//////        HashSet<ListNode> mem = new HashSet<>();
//////        while (head!= null) {
//////            if(mem.contains(head)) {
//////                return true;
//////            }
//////            mem.add(head);
//////            head = head.next;
//////        }
//////        return false;
////
////        if(head == null || head.next == null) {
////            return false;
////        }
////        ListNode slow = head;
////        ListNode fast = head.next;
////        while (slow != fast) {
////            if(fast == null || fast.next == null ) {
////                return false;
////            }
////            slow = slow.next;
////            fast = fast.next.next;
////        }
////        return true;
////     }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
