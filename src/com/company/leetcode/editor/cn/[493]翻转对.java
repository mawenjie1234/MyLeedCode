//package com.company.leetcode.editor.cn;
////给定一个数组 nums ，如果 i < j 且 nums[i] > 2*nums[j] 我们就将 (i, j) 称作一个重要翻转对。
////
//// 你需要返回给定数组中的重要翻转对的数量。
////
//// 示例 1:
////
////
////输入: [1,3,2,3,1]
////输出: 2
////
////
//// 示例 2:
////
////
////输入: [2,4,3,5,1]
////输出: 3
////
////
//// 注意:
////
////
//// 给定数组的长度不会超过50000。
//// 输入数组中的所有数字都在32位整数的表示范围内。
////
//// Related Topics 排序 树状数组 线段树 二分查找 分治算法
//// 👍 126 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        int[] nums = {2, 4, 3, 5, 1};
//        int[] nums2 = {1,3,2,3,1};
//
////        new Solution().merge(nums, 0, nums.length-1);
////        for (int i = 0; i < nums.length; i++) {
////            System.out.print(nums[i]);
////            System.out.print(',');
////        }
//        System.out.println(new Solution().reversePairs(nums2));
//    }
//
//    public int reversePairs(int[] nums) {
//        return merge(nums, 0, nums.length - 1);
//    }
//
//    private int merge(int[] nums, int left, int right) {
//        if (left >= right) {
//            return 0;
//        }
//        int mid = (left + right) >> 1;
//        int leftV = merge(nums, left, mid);
//        if(mid == 2) {
//            System.out.print("");
//        }
//        int rightV = merge(nums, mid + 1, right);
//
//        int mergeV = mergeSort(nums, left, mid, right);
//        return leftV + rightV + mergeV;
//    }
//
//    private int mergeSort(int[] nums, int left, int mid, int right) {
//        int count = 0;
//
//        int[] temp = new int[right - left + 1];
//        int i = 0;
//        int leftIndex = left;
//        int rightIndex = mid + 1;
//
//        while (leftIndex <= mid && rightIndex <= right) {
//            if (nums[leftIndex] <= nums[rightIndex]) {
//                for (int j = mid + 1; j <= right; j++) {
//                    if (nums[leftIndex] > 2 * nums[j]) {
//                        count++;
//                    }
//                }
//            }
//            temp[i++] = nums[leftIndex] < nums[rightIndex] ? nums[leftIndex++] : nums[rightIndex++];
//
//        }
//        while (leftIndex <= mid) {
//            for (int j = mid + 1; j <= right; j++) {
//                if (nums[leftIndex] > 2 * nums[j]) {
//                    count++;
//                }
//            }
//            temp[i++] = nums[leftIndex++];
//        }
//
//        while (rightIndex <= right) {
//            temp[i++] = nums[rightIndex++];
//        }
//
//        for (int j = 0; j < temp.length; j++) {
//            nums[left + j] = temp[j];
//        }
//        return count;
//    }
//
//
////    public int reversePairs(int[] nums) {
////        int count = 0;
////        for (int i = 0; i < nums.length; i++) {
////            for (int j = i + 1; j < nums.length; j++) {
////                if (nums[i] > 2 * nums[j]) {
////                    count++;
////                }
////            }
////        }
////        return count;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
