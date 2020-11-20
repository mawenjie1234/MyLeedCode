//package com.company.leetcode.editor.cn;
////给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
////
//// 示例 1:
////
//// 输入: [1,2,3,4,5,6,7] 和 k = 3
////输出: [5,6,7,1,2,3,4]
////解释:
////向右旋转 1 步: [7,1,2,3,4,5,6]
////向右旋转 2 步: [6,7,1,2,3,4,5]
////向右旋转 3 步: [5,6,7,1,2,3,4]
////
////
//// 示例 2:
////
//// 输入: [-1,-100,3,99] 和 k = 2
////输出: [3,99,-1,-100]
////解释:
////向右旋转 1 步: [99,-1,-100,3]
////向右旋转 2 步: [3,99,-1,-100]
////
//// 说明:
////
////
//// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
//// 要求使用空间复杂度为 O(1) 的 原地 算法。
////
//// Related Topics 数组
//// 👍 629 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        int[] temp = new int[]{1, 2, 3, 4, 5, 6, 7};
//        new Solution().rotate(temp, 3);
//        for (int i = 0; i < temp.length; i++) {
//            System.out.println(temp[i]);
//        }
//    }
//
//    public void rotate(int[] nums, int k) {
//        if (k <= 0) {
//            return;
//        }
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//    }
//
//    private void reverse(int[] nums, int start, int ent) {
//        while (start < ent) {
//            int temp = nums[start];
//            nums[start] = nums[ent];
//            nums[ent] = temp;
//            start++;
//            ent--;
//        }
//    }
//
//
////    public void rotate(int[] nums, int k) {
////
////        for (int i = 0; i < k; i++) {
////            int last = nums[0];
////            for (int j = 1; j < nums.length; j++) {
////                int temp = nums[j];
////                nums[j] = last;
////                last = temp;
////            }
////            nums[0] = last;
////        }
////    }
//
//
////    public void rotate(int[] nums, int k) {
////        k %= nums.length;
////        if(k == 0) {
////            return;
////        }
////        reverse(nums, 0, nums.length - 1);
////        reverse(nums, 0, k - 1);
////        reverse(nums, k, nums.length -1);
////    }
////
////    private void reverse(int[] nums, int start, int end) {
////        while (start < end) {
////            int temp = nums[end];
////            nums[end] = nums[start];
////            nums[start] = temp;
////            start++;
////            end--;
////        }
////    }
//
//
////    public void rotate(int[] nums, int k) {
////        int temp;
////        int pre;
////        for (int i = 0; i < k; i++) {
////            pre = nums[nums.length - 1];
////            for (int j = 0; j < nums.length; j++) {
////                temp = nums[j];
////                nums[j] = pre;
////                pre = temp;
////            }
////        }
////    }
//
//
//}
////leetcode submit region end(Prohibit modification and deletion)
