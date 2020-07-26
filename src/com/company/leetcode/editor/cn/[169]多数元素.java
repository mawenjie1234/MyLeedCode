package com.company.leetcode.editor.cn;
//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [3,2,3]
//输出: 3 
//
// 示例 2: 
//
// 输入: [2,2,1,1,1,2,2]
//输出: 2
// 
// Related Topics 位运算 数组 分治算法 
// 👍 676 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public static void main(String[] args) {
        int[] a = new int[]{2,2,1,1,1,2,2};
//        System.out.println(new Solution().majorityElement(a));
        System.out.println((3+4)>>1);
    }

//    public int majorityElement(int[] nums) {
//
//    }
//
//    private int help(int[] nums, int left, int right) {
//        if(left == right) {
//            return nums[left];
//        }
//
//        int mid = (left + right) >> 1;
//    }


//    public int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> numsCount = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int temp = nums[i];
//            int count = 1;
//            if(numsCount.containsKey(temp)) {
//                count = numsCount.get(temp) + 1;
//                numsCount.put(temp,  count);
//            }else {
//                numsCount.put(temp, count);
//            }
//            if(count > nums.length / 2) {
//                return temp;
//            }
//        }
//        return nums[0];
//    }


//    public int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> numsCount = new HashMap<>();
//        int majority = nums[0];
//
//        for (int i = 0; i < nums.length; i++) {
//            int temp = nums[i];
//            int count = 1;
//            if(numsCount.containsKey(temp)) {
//                count = numsCount.get(temp) + 1;
//                numsCount.remove(temp);
//                numsCount.put(temp,  count);
//            }else {
//                numsCount.put(temp, count);
//            }
//        }
//        int lastCount = 0;
//        int lastMajor = nums[0];
//        for (Map.Entry<Integer, Integer> entry: numsCount.entrySet()) {
//            Integer count = entry.getValue();
//            if(lastCount < count) {
//                lastCount = count;
//                lastMajor = entry.getKey();
//            }
//        }
//        return lastMajor;
//    }

}
//leetcode submit region end(Prohibit modification and deletion)
