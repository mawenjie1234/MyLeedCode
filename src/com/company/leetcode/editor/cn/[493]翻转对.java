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
//        int[] nums2 = {1, 3, 2, 3, 1};
////        int[] nums3 = {2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
////        new Solution().merge(nums, 0, nums.length-1);
////        for (int i = 0; i < nums.length; i++) {
////            System.out.print(nums[i]);
////            System.out.print(',');
////        }
//        System.out.println(new Solution().reversePairs(nums));
////        System.out.print(new Solution().reversePairs2(nums));
//    }
//
//    public int reversePairs(int[] nums) {
//        if (nums == null || nums.length == 0) return 0;
//        return mergeSort(nums, 0, nums.length - 1);
//    }
//
//    private int mergeSort(int[] nums, int l, int r) {
//        if (l >= r) return 0;
//        int mid = (l + r) >> 1;
//
//        int count = mergeSort(nums, l, mid) + mergeSort(nums, mid + 1, r);
//
//        int[] cache = new int[r - l + 1];
//        int i = l, t = l, c = 0;
//        for (int j = mid + 1; j <= r; j++, c++) {
//            while (i <= mid && nums[i] <= 2 * (long) nums[j]) i++;
//            while (t <= mid && nums[t] < nums[j]) cache[c++] = nums[t++];
//            cache[c] = nums[j];
//            count += mid - i + 1;
//        }
//        while (t <= mid) cache[c++] = nums[t++];
//        System.arraycopy(cache, 0, nums, l, r - l + 1);
//        return count;
//    }
//
//    private int mergeSort1(int[] nums, int left, int right) {
//        if (left >= right) {
//            return 0;
//        }
//        int mid = (left + right) >> 1;
//        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
//        int i = left;
//        for (int j = mid + 1; j < right; j++) {
//            while (i <= mid && nums[i] <= 2 * (long) nums[j]) i++;
//            count += mid - i + 1;
//        }
//        return count;
//    }
//
//    private int mergeSort(int[] nums, int left, int mid, int right) {
//        int count = 0;
//
////        int[] temp = new int[right - left + 1];
////        int i = 0;
//        int leftIndex = left;
//        int rightIndex = mid + 1;
//
//        while (leftIndex <= mid && rightIndex <= right) {
//            if (nums[leftIndex] < nums[rightIndex]) {
//                for (int j = mid + 1; j <= right; j++) {
//                    if ((long) nums[leftIndex] > 2 * (long) nums[j]) {
//                        count++;
//                    }
//                }
//                leftIndex++;
//            } else {
//                rightIndex++;
//            }
////            temp[i++] = nums[leftIndex] < nums[rightIndex] ? nums[leftIndex++] : nums[rightIndex++];
//        }
//        while (leftIndex <= mid) {
//            for (int j = mid + 1; j <= right; j++) {
//                if (nums[leftIndex] > 2 * (long) nums[j]) {
//                    count++;
//                }
//            }
//            leftIndex++;
////            temp[i++] = nums[leftIndex++];
//        }
//
////        while (rightIndex <= right) {
////            temp[i++] = nums[rightIndex++];
////        }
//
////        for (int j = 0; j < temp.length; j++) {
////            nums[left + j] = temp[j];
////        }
//        return count;
//    }
//
//
////    public int reversePairs2(int[] nums) {
////        int count = 0;
////        for (int i = 0; i < nums.length; i++) {
////            for (int j = i + 1; j < nums.length; j++) {
////                if ((long) nums[i] > 2 * (long) nums[j]) {
////                    System.out.println("x" + nums[i] + " j:" + nums[j]);
////                    count++;
////                }
////            }
////        }
////        return count;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
