//package com.company.leetcode.editor.cn;
////给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
////
//// 说明：解集不能包含重复的子集。
////
//// 示例:
////
//// 输入: nums = [1,2,3]
////输出:
////[
////  [3],
////  [1],
////  [2],
////  [1,2,3],
////  [1,3],
////  [2,3],
////  [1,2],
////  []
////]
//// Related Topics 位运算 数组 回溯算法
//// 👍 671 👎 0
//
//
//import java.util.ArrayList;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        List<List<Integer>> res = new Solution().subsets(new int[]{1, 2, 3});
////        for (List<Integer> curr : res) {
////            for (Integer num : curr) {
////                System.out.print(num);
////            }
////            System.out.println();
////        }
////    }
//
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        help(nums, 0, res, new ArrayList<>());
//        return res;
//    }
//
//    public void help(int[] nums, int index, List<List<Integer>> res, List<Integer> current) {
//        if(index == nums.length) {
//            res.add(new ArrayList<>(current));
//            return;
//        }
//
//        help(nums, index +1, res, current);
//        current.add(nums[index]);
//        help(nums, index +1, res, current);
//
//        current.remove(current.size() -1);
//    }
//
//
//
////    public List<List<Integer>> subsets(int[] nums) {
////        List<List<Integer>> res = new ArrayList<>();
////        res.add(new ArrayList<>());
////        for (int num : nums) {
////            List<List<Integer>> newSubsets = new ArrayList<>();
////            for (List<Integer> curr : res) {
////                ArrayList<Integer> resNew = new ArrayList<>(curr) {
////                };
////                resNew.add(num);
////                newSubsets.add(resNew);
////            }
////            res.addAll(newSubsets);
////        }
////
////        return res;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
