//package com.company.leetcode.editor.cn;
////给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
////
//// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
////
////
////
//// 示例:
////
//// 输入："23"
////输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
////
////
//// 说明:
////尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
//// Related Topics 字符串 回溯算法
//// 👍 806 👎 0
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        List<String> res = new Solution().letterCombinations("23");
////        for (String s: res) {
////            System.out.println(s);
////        }
////    }
//
//    public List<String> letterCombinations(String digits) {
//        List<String> res = new ArrayList<>();
//        if(digits == null || digits.length() == 0) {
//            return res;
//        }
//
//        HashMap<Character, String> map = new HashMap<>();
//        map.put('2', "abc");
//        map.put('3', "def");
//        map.put('4', "ghi");
//        map.put('5', "jkl");
//        map.put('6', "mno");
//        map.put('7', "pqrs");
//        map.put('8', "tuv");
//        map.put('9', "wxyz");
//        helper(res, digits, map, 0, "");
//        return res;
//    }
//
//    private void helper(List<String> res, String digits, Map<Character, String> map, int i, String current) {
//        if (i == digits.length()) {
//            res.add(current);
//            return;
//        }
//        Character num = digits.charAt(i);
//        String letters = map.get(num);
//        for (int j = 0; j < letters.length(); j++) {
//            helper(res, digits, map, i +1, current + letters.charAt(j));
//        }
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
