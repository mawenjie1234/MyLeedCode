//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//
//注意：答案中不可以包含重复的三元组。
//给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        if (nums[0] > 0 || nums[len - 1] < 0) {
            return res;
        }
        // 此处i<len 跑分24 和 i < len - 2 跑分31
        for (int i = 0; i < len; i++) {
            if(nums[i] > 0) {// 已经拍好序列的，如果当前已经大于0了。后面的一定大于0
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {// 当前值上一个值已经算过了。
                continue;
            }
            int first = i + 1;
            int last = len - 1;
            while (first < last) {
                int sum = nums[first] + nums[last] + nums[i];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[first], nums[last]));
                    while (first < last && nums[first] == nums[first + 1]) first ++;
                    while (first < last && nums[last] == nums[last - 1]) last --;
                    first++;
                    last--;
                } else if (sum < 0) {
                    first++;
                } else {
                    last--;
                }
            }
        }
        return res;
    }
}

// List<List<Integer>> ans = new ArrayList();
//        int len = nums.length;
//        if(nums == null || len < 3) return ans;
//        Arrays.sort(nums); // 排序
//        for (int i = 0; i < len ; i++) {
//            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
//            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
//            int L = i+1;
//            int R = len-1;
//            while(L < R){
//                int sum = nums[i] + nums[L] + nums[R];
//                if(sum == 0){
//                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
//                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
//                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
//                    L++;
//                    R--;
//                }
//                else if (sum < 0) L++;
//                else if (sum > 0) R--;
//            }
//        }
//        return ans;
//
//作者：guanpengchn
//链接：https://leetcode-cn.com/problems/3sum/solution/hua-jie-suan-fa-15-san-shu-zhi-he-by-guanpengchn/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//leetcode submit region end(Prohibit modification and deletion)
