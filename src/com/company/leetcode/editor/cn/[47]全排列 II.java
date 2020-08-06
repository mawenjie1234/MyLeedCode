//package com.company.leetcode.editor.cn;
////给定一个可包含重复数字的序列，返回所有不重复的全排列。
////
//// 示例:
////
//// 输入: [1,1,2]
////输出:
////[
////  [1,1,2],
////  [1,2,1],
////  [2,1,1]
////]
//// Related Topics 回溯算法
//// 👍 355 👎 0
//
//
//import java.util.*;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        int[] nums = {1, 1, 2};
//        List<List<Integer>> res = new Solution().permuteUnique(nums);
//        for (List<Integer> one : res) {
//            for (Integer item : one) {
//                System.out.print(item);
//            }
//            System.out.println();
//        }
//    }
//
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        int n = nums.length;
//        List<List<Integer>> res = new ArrayList<>();
//        if (n == 0) {
//            return res;
//        }
//        Arrays.sort(nums);
//        helper(nums, 0, new boolean[n], new ArrayDeque<>(n), res);
//        return res;
//    }
//
//    private void helper(int[] nums, int deep, boolean[] used, Deque<Integer> current, List<List<Integer>> res) {
//        if (deep == nums.length) {
//            res.add(new ArrayList<>(current));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (used[i]) {
//                continue;
//            }
//            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
//                continue;
//            }
//            used[i] = true;
//            current.addLast(nums[i]);
//            helper(nums, deep + 1, used, current, res);
//            used[i] = false;
//            current.removeLast();
//        }
//    }
//
//
////    public List<List<Integer>> permuteUnique(int[] nums) {
////        List<List<Integer>> res = new ArrayList<>();
////        int n = nums.length;
////        if (n == 0) {
////            return res;
////        }
////        Arrays.sort(nums);
////        helper(nums, 0, new boolean[n], new ArrayDeque<>(n), res);
////        return res;
////    }
////
////    private void helper(int[] nums, int deep, boolean[] used, Deque<Integer> current, List<List<Integer>> res) {
////        if (deep == nums.length) {
////            res.add(new ArrayList<>(current));
////            return;
////        }
////        for (int i = 0; i < nums.length; i++) {
////            if (used[i]) {
////                continue;
////            }
////            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
////                continue;
////            }
////            current.addLast(nums[i]);
////            used[i] = true;
////            helper(nums, deep +1, used, current, res);
////            used[i] = false;
////            current.removeLast();
////        }
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
