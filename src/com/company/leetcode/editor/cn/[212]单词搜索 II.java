//package com.company.leetcode.editor.cn;
////给定一个二维网格 board 和一个字典中的单词列表 words，找出所有同时在二维网格和字典中出现的单词。
////
//// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。
////
////
//// 示例:
////
//// 输入:
////words = ["oath","pea","eat","rain"] and board =
////[
////  ['o','a','a','n'],
////  ['e','t','a','e'],
////  ['i','h','k','r'],
////  ['i','f','l','v']
////]
////
////输出: ["eat","oath"]
////
//// 说明:
////你可以假设所有输入都由小写字母 a-z 组成。
////
//// 提示:
////
////
//// 你需要优化回溯算法以通过更大数据量的测试。你能否早点停止回溯？
//// 如果当前单词不存在于所有单词的前缀中，则可以立即停止回溯。什么样的数据结构可以有效地执行这样的操作？散列表是否可行？为什么？ 前缀树如何？如果你想学习如何
////实现一个基本的前缀树，请先查看这个问题： 实现Trie（前缀树）。
////
//// Related Topics 字典树 回溯算法
//// 👍 218 👎 0
//
//
//import java.util.ArrayList;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public static void main(String[] args) {
//        char[][] chars = {
//                {'o', 'a', 'a', 'n'},
//                {'e', 't', 'a', 'e'},
//                {'i', 'h', 'k', 'r'},
//                {'i', 'f', 'l', 'v'}
//        };
//        String[] words = {"oath", "pea", "eat", "rain"};
//
//        List<String> res = new Solution().findWords(chars, words);
//        for (String s : res) {
//            System.out.println(s);
//        }
//    }
//
//    public List<String> findWords(char[][] board, String[] words) {
//        Trie trie = new Trie();
//        for (String word : words) {
//            trie.insert(word);
//        }
//
//        List<String> res = new ArrayList<>();
//        for (int i = 0; i < board.length; i++) {
//            char[] row = board[i];
//            for (int j = 0; j < row.length; j++) {
//                if(i == 1 && j ==0) {
//                    System.out.println();
//                }
//                boolean find = helper(board, res, i, j, trie.root);
//                if(find) {
//                    System.out.println(i + ", "+  j);
//                }
//            }
//        }
//        return res;
//    }
//
//    //              left, bottom, right, top
//    int[] mRow =    {0, 1, 0, -1};
//    int[] mColumn = {-1, 0, 1, 0};
//
//    private boolean helper(char[][] board, List<String> res, int row, int column, TrieNode trieNode) {
//        // terminal
//        boolean find = false;
//        if (trieNode.isEnd()) {
//            find = true;
//            res.add(trieNode.mWord);
//        }
//        char ch = board[row][column];
//        board[row][column] = '#';
//        // progress
//        for (int i = 0; i < mRow.length; i++) {
//            int nextRow = row + mRow[i];
//            int nextColumn = column + mColumn[i];
//            if (nextRow >= 0 && nextRow < board.length && nextColumn >= 0 && nextColumn < board[0].length) {
//                char newCh = board[nextRow][nextColumn];
//                if (newCh != '#' && trieNode.contains(newCh)) {
//                    find = helper(board, res, nextRow, nextColumn, trieNode.get(newCh)) || find;
//                }
//            }
//        }
//        //down
//
//        //revert
//        board[row][column] = ch;
//        return find;
//    }
//
//    class Trie {
//
//        TrieNode root;
//
//        /**
//         * Initialize your data structure here.
//         */
//        public Trie() {
//            root = new TrieNode("");
//        }
//
//        /**
//         * Inserts a word into the trie.
//         */
//        public void insert(String word) {
//            TrieNode node = root;
//            for (int i = 0; i < word.length(); i++) {
//                char ch = word.charAt(i);
//                if (!node.contains(ch)) {
//                    node.put(ch, new TrieNode(node.mWord + ch));
//                }
//                node = node.get(ch);
//            }
//            node.setEnd();
//        }
//
//        /**
//         * Returns if the word is in the trie.
//         */
//        public boolean search(String word) {
//            TrieNode node = searchTrieNode(word);
//            return node != null && node.isEnd();
//        }
//
//        private TrieNode searchTrieNode(String word) {
//            TrieNode node = root;
//            for (int i = 0; i < word.length(); i++) {
//                char ch = word.charAt(i);
//                if (node.contains(ch)) {
//                    node = node.get(ch);
//                } else {
//                    node = null;
//                    break;
//                }
//            }
//            return node;
//        }
//
//        /**
//         * Returns if there is any word in the trie that starts with the given prefix.
//         */
//        public boolean startsWith(String prefix) {
//            return searchTrieNode(prefix) != null;
//        }
//    }
//
//    class TrieNode {
//        private boolean isEnd = false;
//        private String mWord = null;
//        private TrieNode[] nodes;
//
//        public TrieNode(String word) {
//            nodes = new TrieNode[26];
//            mWord = word;
//        }
//
//        public void put(char ch, TrieNode node) {
//            nodes[ch - 'a'] = node;
//        }
//
//        public TrieNode get(char ch) {
//            return nodes[ch - 'a'];
//        }
//
//        public boolean contains(char ch) {
//            TrieNode node = nodes[ch - 'a'];
//            return node != null;
//        }
//
//        public boolean isEnd() {
//            return isEnd;
//        }
//
//        public void setEnd() {
//            isEnd = true;
//        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
