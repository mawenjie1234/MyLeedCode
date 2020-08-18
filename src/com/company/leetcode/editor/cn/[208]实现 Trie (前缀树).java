//package com.company.leetcode.editor.cn;
////实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
////
//// 示例:
////
//// Trie trie = new Trie();
////
////trie.insert("apple");
////trie.search("apple");   // 返回 true
////trie.search("app");     // 返回 false
////trie.startsWith("app"); // 返回 true
////trie.insert("app");
////trie.search("app");     // 返回 true
////
//// 说明:
////
////
//// 你可以假设所有的输入都是由小写字母 a-z 构成的。
//// 保证所有输入均为非空字符串。
////
//// Related Topics 设计 字典树
//// 👍 380 👎 0
//
//
//import com.company.Utils.Pair;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Trie {
//
//    TrieNode root;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public Trie() {
//        root = new TrieNode();
//    }
//
//    /**
//     * Inserts a word into the trie.
//     */
//    public void insert(String word) {
//        TrieNode node = root;
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (!node.contains(ch)) {
//                node.put(ch, new TrieNode());
//            }
//            node = node.get(ch);
//        }
//        node.setEnd();
//    }
//
//    /**
//     * Returns if the word is in the trie.
//     */
//    public boolean search(String word) {
//        TrieNode node = searchTrieNode(word);
//        return node != null && node.isEnd();
//    }
//
//    private TrieNode searchTrieNode(String word) {
//        TrieNode node = root;
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (node.contains(ch)) {
//                node = node.get(ch);
//            } else {
//                node = null;
//                break;
//            }
//        }
//        return node;
//    }
//
//    /**
//     * Returns if there is any word in the trie that starts with the given prefix.
//     */
//    public boolean startsWith(String prefix) {
//        return searchTrieNode(prefix) != null;
//    }
//
//    class TrieNode {
//        private boolean isEnd = false;
//        private TrieNode[] nodes;
//
//        public TrieNode() {
//            nodes = new TrieNode[26];
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
//
///**
// * Your Trie object will be instantiated and called as such:
// * Trie obj = new Trie();
// * obj.insert(word);
// * boolean param_2 = obj.search(word);
// * boolean param_3 = obj.startsWith(prefix);
// */
////leetcode submit region end(Prohibit modification and deletion)
