//package com.company.leetcode.editor.cn;
////给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
////
//// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
////
//// 示例:
////
//// 给定 nums = [2, 7, 11, 15], target = 9
////
////因为 nums[0] + nums[1] = 2 + 7 = 9
////所以返回 [0, 1]
////
//// Related Topics 数组 哈希表
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
///*
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
//示例:
//
//给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// */
//
//import java.util.HashMap;
//
//class Solution {
//
//    public static void main(String[] args) {
//        int[] res = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]);
//            System.out.print(",");
//        }
//    }
//
//    public int[] twoSum(int[] nums, int target) {
//
//    }
//
//
////    public int[] twoSum(int[] nums, int target) {
////        HashMap<Integer, Integer> res = new HashMap<>();
////
////        for (int i = 0; i < nums.length; i++) {
////            int key = target - nums[i];
////            if(res.containsKey(key)) {
////                return new int[] {res.get(key), i};
////            }else {
////                res.put(nums[i], i);
////            }
////        }
////
////        return new int[]{};
////    }
//
//
//
////    public int[] twoSum(int[] nums, int target) {
////        HashMap<Integer, Integer> hashMap = new HashMap<>();
////        for (int i = 0; i < nums.length; i++) {
////            int findKey = target - nums[i];
////            if(hashMap.containsKey(findKey)) {
////                return new int[] {hashMap.get(findKey), i};
////            }
////            hashMap.put(nums[i], i);
////        }
////        return new int[]{};
////    }
//
//
//
////    public int[] twoSum(int[] nums, int target) {
////        HashMap<Integer, Integer> numsMap = new HashMap<>(nums.length);
////        for (int i = 0; i < nums.length; i++) {
////            int findKey = target - nums[i];
////            if (numsMap.containsKey(findKey)) {
////                int findIndex = numsMap.get(findKey);
////                if(findIndex != i) {
////                    return new int[]{numsMap.get(findKey), i};
////                }
////            }
////            numsMap.put(nums[i], i);
////        }
////        return new int[]{};
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
