//package com.company.leetcode.editor.cn;
////给定两个单词（beginWord 和 endWord）和一个字典 wordList，找出所有从 beginWord 到 endWord 的最短转换序列。转换
////需遵循如下规则：
////
////
//// 每次转换只能改变一个字母。
//// 转换后得到的单词必须是字典中的单词。
////
////
//// 说明:
////
////
//// 如果不存在这样的转换序列，返回一个空列表。
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
////输出:
////[
////  ["hit","hot","dot","dog","cog"],
////  ["hit","hot","lot","log","cog"]
////]
////
////
//// 示例 2:
////
//// 输入:
////beginWord = "hit"
////endWord = "cog"
////wordList = ["hot","dot","dog","lot","log"]
////
////输出: []
////
////解释: endWord "cog" 不在字典中，所以不存在符合要求的转换序列。
//// Related Topics 广度优先搜索 数组 字符串 回溯算法
//// 👍 299 👎 0
//
//
////import com.company.Utils.Pair;
//
//import java.util.*;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
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
////        String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
////        List<List<String>> res = new Solution().findLadders("hit", "cog", Arrays.asList(wordList));
//
////        String[] wordList = {"hot","dot","dog","lot","log"};
////        String[] wordList = {"a","b","c"};
////        List<List<String>> res = new Solution().findLadders("a", "c", Arrays.asList(wordList));
//
//        String[] wordList = {"hot","cog","dog","tot","hog","hop","pot","dot"};
//        List<List<String>> res = new Solution().findLadders("hot", "dog", Arrays.asList(wordList));
//        for (List<String> one: res) {
//            for (String item: one) {
//                System.out.print(item + ",");
//            }
//            System.out.println();
//        }
//    }
//
//    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//        int l = beginWord.length();
//        HashMap<String, List<String>> dic = new HashMap<>();
//        for (String word : wordList) {
//            for (int i = 0; i < l; i++) {
//                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, l);
//                List<String> dicList = dic.getOrDefault(newWord, new ArrayList<>());
//                dicList.add(word);
//                dic.put(newWord, dicList);
//            }
//        }
//
//        Queue<Pair<String, List<String>>> q = new ArrayDeque<>();
//        LinkedList<String> firstLinked = new LinkedList<>();
//        firstLinked.add(beginWord);
//        q.add(new Pair<>(beginWord, firstLinked));
//
//        List<List<String>> res = new ArrayList<>();
//        HashSet<String> visited = new HashSet<>();
//        visited.add(beginWord);
//        helper(dic, visited, res, q, endWord);
//        return res;
//    }
//
//    private void helper(HashMap<String, List<String>> dic, HashSet<String> visited, List<List<String>> res,
//                        Queue<Pair<String, List<String>>> q, String endWord) {
//
//        while (!q.isEmpty()) {
//            int size = q.size();
//            for (int wordIndex = 0; wordIndex < size; wordIndex++) {
//                Pair<String, List<String>> node = q.remove();
//                String word = node.fst;
//                List<String> list = node.snd;
//                for (int i = 0; i < word.length(); i++) {
//                    String newWord = word.substring(0, i) + "*" + word.substring(i + 1);
//                    for (String adWord : dic.getOrDefault(newWord, new ArrayList<>())) {
//                        if (adWord.equals(endWord)) {
//                            List<String> nextArray = new ArrayList<>(list);
//                            nextArray.add(endWord);
//                            res.add(nextArray);
//                            continue;
//                        }
//                        if (!visited.contains(adWord)) {
//                            visited.add(adWord);
//                            List<String> nexArray = new ArrayList<>(list);
//                            nexArray.add(adWord);
//                            q.add(new Pair<>(adWord, nexArray));
//                        }
//                    }
//                }
//            }
//
//            if (res.size() == 0) {
//                helper(dic, visited, res, q, endWord);
//            }else {
//                return;
//            }
//        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
