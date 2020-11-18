//package com.company.leetcode.editor.cn;
////给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
////
//// 示例:
////
//// 输入: [0,1,0,3,12]
////输出: [1,3,12,0,0]
////
//// 说明:
////
////
//// 必须在原数组上操作，不能拷贝额外的数组。
//// 尽量减少操作次数。
////
//// Related Topics 数组 双指针
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
//        new Solution().moveZeroes(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]);
//            System.out.print(",");
//        }
//    }
//    public void moveZeroes(int[] nums) {
//
//    }
//
////
////    public void moveZeroes(int[] nums) {
////        int lastZeroIndex = 0;
////        for (int i = 0; i < nums.length; i++) {
////            if(nums[i] != 0) {
////                nums[lastZeroIndex] = nums[i];
////                if(lastZeroIndex != i) {
////                    nums[i] = 0;
////                }
////                lastZeroIndex++;
////            }
////        }
////    }
//
//
////    public void moveZeroes(int[] nums) {
////        int lastZeroIndex = -1;
////        for (int i = 0; i < nums.length; i++) {
////            if(nums[i] != 0 && lastZeroIndex > -1) {
////                int temp = nums[i];
////                nums[i] = 0;
////                nums[lastZeroIndex] = temp;
////                lastZeroIndex++;
////            }else {
////                if(lastZeroIndex == -1) {
////                    lastZeroIndex = i;
////                }
////            }
////        }
////    }
//
//    // 第二遍。
////    public void moveZeroes(int[] nums) {
////        int lastNotZeroIndex = 0;
////        for (int i = 0; i < nums.length; i++) {
////            if(nums[i] != 0) {
////                nums[lastNotZeroIndex] = nums[i];
////                if(lastNotZeroIndex != i) {
////                    nums[i] = 0;
////                }
////                lastNotZeroIndex++;
////            }
////        }
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
