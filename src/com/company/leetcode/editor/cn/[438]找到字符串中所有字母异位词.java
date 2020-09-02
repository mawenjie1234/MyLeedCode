//package com.company.leetcode.editor.cn;
////给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
////
//// 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
////
//// 说明：
////
////
//// 字母异位词指字母相同，但排列不同的字符串。
//// 不考虑答案输出的顺序。
////
////
//// 示例 1:
////
////
////输入:
////s: "cbaebabacd" p: "abc"
////
////输出:
////[0, 6]
////
////解释:
////起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
////起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
////
////
//// 示例 2:
////
////
////输入:
////s: "abab" p: "ab"
////
////输出:
////[0, 1, 2]
////
////解释:
////起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
////起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
////起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
////
//// Related Topics 哈希表
//// 👍 358 👎 0
//
//
//import java.util.*;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        List<Integer> res = new Solution().findAnagrams("abab", "ab");
////        for (Integer i:  res) {
////            System.out.print(i);
////            System.out.print(",");
////        }
////    }
//
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> res = new ArrayList<>();
//        if (s.length() == 0 || p.length() == 0 || p.length() > s.length()) {
//            return res;
//        }
//        int start = 0;
//        int end = p.length() - 1;
//        int[] nums = new int[26];
//        for (int i = 0; i < p.length(); i++) {
//            char ps = p.charAt(i);
//            nums[ps - 'a'] += 1;
//        }
//        for (; end < s.length(); end++, start++) {
//             int[] copy = Arrays.copyOf(nums, 26);
//            for (int i = start; i <= end; i++) {
//                char is = s.charAt(i);
//                copy[is - 'a'] -= 1;
//            }
//            boolean isSame = true;
//            for (int i = 0; i < copy.length; i++) {
//                if(copy[i] != 0) {
//                    isSame = false;
//                    break;
//                }
//            }
//            if(isSame) {
//                res.add(start);
//            }
//        }
//        return res;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
