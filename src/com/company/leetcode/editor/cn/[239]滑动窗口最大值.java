//package com.company.leetcode.editor.cn;
////给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。
//// 滑动窗口每次只向右移动一位。
////
////
//// 返回滑动窗口中的最大值。
////
////
////
//// 进阶：
////
//// 你能在线性时间复杂度内解决此题吗？
////
////
////
//// 示例:
////
//// 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
////输出: [3,3,5,5,6,7]
////解释:
////
////  滑动窗口的位置                最大值
////---------------               -----
////[1  3  -1] -3  5  3  6  7       3
//// 1 [3  -1  -3] 5  3  6  7       3
//// 1  3 [-1  -3  5] 3  6  7       5
//// 1  3  -1 [-3  5  3] 6  7       5
//// 1  3  -1  -3 [5  3  6] 7       6
//// 1  3  -1  -3  5 [3  6  7]      7
////
////
////
//// 提示：
////
////
//// 1 <= nums.length <= 10^5
//// -10^4 <= nums[i] <= 10^4
//// 1 <= k <= nums.length
////
//// Related Topics 堆 Sliding Window
//
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.Stack;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    // deque 中存储的是第几个最大值，i， 所有需要注意使用nums【deque.index】
//    public int[] maxSlidingWindow(int[] nums, int k) {
//
//    }
//
//
////    public int[] maxSlidingWindow(int[] nums, int k) {
////        int length = nums.length;
////        if (length * k == 0) {
////            return new int[0];
////        }
////        if (k == 1) {
////            return nums;
////        }
////
////        ArrayDeque<Integer> deque = new ArrayDeque<>();
////        int maxIndex = 0;
////        for (int i = 0; i < k; i++) {
////            clearQueue(nums, deque, i, k);
////            deque.addLast(i);
////            if (nums[i] > nums[maxIndex]) {
////                maxIndex = i;
////            }
////        }
////        int[] res = new int[length - k + 1];
////        res[0] = nums[maxIndex];
////
////        for (int i = k; i < length; i++) {
////            clearQueue(nums, deque, i, k);
////            deque.addLast(i);
////            res[i - k + 1] = nums[deque.getFirst()];
////        }
////
////        return res;
////    }
////
////    private void clearQueue(int[] nums, ArrayDeque<Integer> deque, int i, int k) {
////        if (!deque.isEmpty() && deque.getFirst() == i - k) {
////            deque.removeFirst();
////        }
////        while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
////            deque.removeLast();
////        }
////    }
//
//
////    private void clearQueue(int[] nums, ArrayDeque<Integer> deque, int i, int k) {
////        if (!deque.isEmpty() && deque.getFirst() == i - k) {
////            deque.removeFirst();
////        }
////        while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
////            deque.removeLast();
////        }
////    }
////
////    public int[] maxSlidingWindow(int[] nums, int k) {
////        int length = nums.length;
////        if (length * k == 0) {
////            return new int[0];
////        }
////        if (k == 1) {
////            return nums;
////
////        }
////        ArrayDeque<Integer> maxDequeue = new ArrayDeque<>();
////        int maxIndex = 0;
////
////        for (int i = 0; i < k; i++) {
////            clearQueue(nums, maxDequeue, i, k);
////            maxDequeue.addLast(i);
////            if (nums[i] > nums[maxIndex]) {
////                maxIndex = i;
////            }
////        }
////        int[] res = new int[nums.length - k + 1];
////        res[0] = nums[maxIndex];
////
////        for (int i = k; i < length; i++) {
////            clearQueue(nums, maxDequeue, i, k);
////            maxDequeue.addLast(i);
////            res[i - k + 1] = nums[maxDequeue.getFirst()];
////        }
////        return res;
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
