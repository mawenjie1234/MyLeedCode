//package com.company.leetcode.editor.cn;
////给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
////
//// 示例 1:
////
//// 输入: s = "anagram", t = "nagaram"
////输出: true
////
////
//// 示例 2:
////
//// 输入: s = "rat", t = "car"
////输出: false
////
//// 说明:
////你可以假设字符串只包含小写字母。
////
//// 进阶:
////如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
//// Related Topics 排序 哈希表
//// 👍 219 👎 0
//
//
//import java.util.HashMap;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
//        System.out.println(new Solution().isAnagram(s, t));
//    }
//
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) {
//            return false;
//        }
//        int[] nums = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char sChar = s.charAt(i);
//            nums[sChar-'a']++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            char tChar = t.charAt(i);
//            int index = tChar - 'a';
//            nums[index]--;
//            if(nums[index] < 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//
//
//
////    public boolean isAnagram(String s, String t) {
////        if(s.length() != t.length()) {
////            return false;
////        }
////        int[] count = new int[26];
////        for (int i = 0; i < s.length(); i++) {
////            count[s.charAt(i) - 'a']++;
////        }
////        for (int i = 0; i < t.length(); i++) {
////            int index = t.charAt(i) - 'a';
////            count[index]--;
////            if(count[index] < 0) {
////                return false;
////            }
////        }
////        return true;
////    }
//
////    public boolean isAnagram(String s, String t) {
////        if (s.length() != t.length()) {
////            return false;
////        }
////
////        int[] count = new int[26];
////        for (int i = 0; i < s.length(); i++) {
////            count[s.charAt(i) - 'a']++;
////            count[t.charAt(i) - 'a']--;
////        }
////
////        for (int value : count) {
////            if (value != 0) {
////                return false;
////            }
////        }
////        return true;
////    }
//
//
////    public boolean isAnagram(String s, String t) {
////        HashMap<Character, Integer> char1 = new HashMap<>();
////        for (int i = 0; i < s.length(); i++) {
////            char temp = s.charAt(i);
////            if (char1.containsKey(temp)) {
////                Integer count = char1.get(temp);
////                char1.put(temp, count + 1);
////            } else {
////                char1.put(temp, 1);
////            }
////        }
////        for (int i = 0; i < t.length(); i++) {
////            Character temp = t.charAt(i);
////            if (!char1.containsKey(temp)) {
////                return false;
////            } else {
////                int count = char1.get(temp);
////                if (count <= 1) {
////                    char1.remove(temp);
////                } else {
////                    char1.put(temp, count - 1);
////                }
////            }
////        }
////        return char1.isEmpty();
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
