//package com.company.leetcode.editor.cn;
////给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
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
//import java.util.*;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static class Pair<A, B> {
//
//        public final A fst;
//        public final B snd;
//
//        public Pair(A fst, B snd) {
//            this.fst = fst;
//            this.snd = snd;
//        }
//    }
//
//    public static void main(String[] args) {
//        String beginWord = "hit";
//        String endWord = "cog";
//        String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
//        List<String> words = Arrays.asList(wordList);
//        System.out.println(new Solution().ladderLength(beginWord, endWord, words));
//    }
//
//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//        int l = beginWord.length();
//        HashMap<String, List<String>> dic = new HashMap<>();
//        for (String word : wordList) {
//            for (int i = 0; i < word.length(); i++) {
//                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, word.length());
//                List<String> dicList = dic.getOrDefault(newWord, new ArrayList<>());
//                dicList.add(word);
//                dic.put(newWord, dicList);
//            }
//        }
//        Queue<Pair<String, Integer>> q = new ArrayDeque<>();
//        q.add(new Pair<>(beginWord, 1));
//        HashSet<String> visited = new HashSet<>();
//        visited.add(beginWord);
//
//        while (!q.isEmpty()) {
//            Pair<String, Integer> node = q.remove();
//            String word = node.fst;
//            Integer index = node.snd;
//            for (int i = 0; i < word.length(); i++) {
//                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, word.length());
//                for (String adjacentWord : dic.getOrDefault(newWord, new ArrayList<>())) {
//                    if (adjacentWord.endsWith(endWord)) {
//                        return index + 1;
//                    }
//                    if (visited.contains(adjacentWord)) {
//                        continue;
//                    }
//                    visited.add(adjacentWord);
//                    q.add(new Pair<>(adjacentWord, index + 1));
//                }
//            }
//        }
//        return 0;
//    }
//
//
////    public int ladderLength1(String beginWord, String endWord, List<String> wordList) {
////        int l = beginWord.length();
////        Map<String, List<String>> allComboDict = new HashMap<>();
////
////        for (String word : wordList) {
////            for (int i = 0; i < l; i++) {
////                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, l); // h*t,  *ot, ho*
////                List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<>());
////                transformations.add(word);
////                allComboDict.put(newWord, transformations);
////            }
////        }
////
////        Queue<Pair<String, Integer>> q = new LinkedList<>();
////        q.add(new Pair<>(beginWord, 1));
////
////        Set<String> visited = new HashSet<>();
////        visited.add(beginWord);
////
////        while (!q.isEmpty()) {
////            Pair<String, Integer> node = q.remove();
////            String word = node.fst;
////            int level = node.snd;
////
////            for (int i = 0; i < l; i++) {
////                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, l);
////                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
////                    if (adjacentWord.endsWith(endWord)) {
////                        return level + 1;
////                    }
////                    if(!visited.contains(adjacentWord)) {
////                        visited.add(adjacentWord);
////                        q.add(new Pair<>(adjacentWord, level +1));
////                    }
////                }
////            }
////        }
////        return 0;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
