//package com.company.leetcode.editor.cn;//给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
////
////
////
//// 每次转换只能改变一个字母。
//// 转换过程中的中间单词必须是字典中的单词。
////
////
//// 说明:
////
////
//// 如果不存在这样的转换序列，返回 0。
//// 所有单词具有相同的长度。
//// 所有单词只由小写字母组成。
//// 字典中不存在重复的单词。
//// 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
////
////
//// 示例 1:
////
//// 输入:
////beginWord = "hit",
////endWord = "cog",
////wordList = ["hot","dot","dog","lot","log","cog"]
////
////输出: 5
////
////解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
////     返回它的长度 5。
////
////
//// 示例 2:
////
//// 输入:
////beginWord = "hit"
////endWord = "cog"
////wordList = ["hot","dot","dog","lot","log"]
////
////输出: 0
////
////解释: endWord "cog" 不在字典中，所以无法进行转换。
//// Related Topics 广度优先搜索
//// 👍 391 👎 0
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        String beginWord = "hit";
//        String endWord = "cog";
//        String[] wordList = {"hot","dot","dog","lot","log","cog"};
//        List<String> words = Arrays.asList(wordList);
//        System.out.println( new Solution().ladderLength(beginWord, endWord, words));
//
//    }
//
//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
////        HashSet<String> word = new HashSet<>(wordList);
//        int index = helper(beginWord, endWord, 0, wordList);
//        return index;
//    }
//
//    private int helper(String current, String endWord, int index, List<String> word) {
//        if (index == endWord.length()) {
//            return index;
//        }
//        for (String dic : word) {
//            boolean useful = true;
//            for (int i = 0; i < index; i++) {
//                if (current.charAt(i) != dic.charAt(i)) {
//                    useful = false;
//                    break;
//                }
//            }
//
//            if (useful && dic.charAt(index) == endWord.charAt(index)) {
//                System.out.println("current " + current+" dic is " + dic + " index " + index);
//                StringBuilder stringBuilder = new StringBuilder(current);
//                stringBuilder.setCharAt(index, endWord.charAt(index));
//                helper(stringBuilder.toString(), endWord, index + 1, word);
//            }
//        }
//        return index;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
