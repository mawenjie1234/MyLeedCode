//package com.company.leetcode.editor.cn;
////给定一个 没有重复 数字的序列，返回其所有可能的全排列。
////
//// 示例:
////
//// 输入: [1,2,3]
////输出:
////[
////  [1,2,3],
////  [1,3,2],
////  [2,1,3],
////  [2,3,1],
////  [3,1,2],
////  [3,2,1]
////]
//// Related Topics 回溯算法
//// 👍 795 👎 0
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        int[] nums = {1,2,3};
////        List<List<Integer>> res = new Solution().permute(nums);
////        for (List<Integer> oneLine: res) {
////            for (Integer value: oneLine) {
////                System.out.print(value);
////            }
////            System.out.println();
////        }
////    }
//
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> out = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            out.add(nums[i]);
//        }
//        helper(res, out, 0);
//        return res;
//    }
//
//    private void helper(List<List<Integer>> res, List<Integer> out, int index) {
//        if(index == out.size()) {
//            res.add(new ArrayList<>(out));
//            return;
//        }
//        for (int i = index; i < out.size(); i++) {
//            Collections.swap(out, index, i);
//            helper(res, out, index + 1);
//            Collections.swap(out, index, i);
//        }
//    }
//
//    private
//}
////leetcode submit region end(Prohibit modification and deletion)
