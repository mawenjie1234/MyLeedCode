//package com.company.leetcode.editor.cn;
////给定两个字符串 s 和 t，判断它们是否是同构的。
////
//// 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
////
//// 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
////
//// 示例 1:
////
//// 输入: s = "egg", t = "add"
////输出: true
////
////
//// 示例 2:
////
//// 输入: s = "foo", t = "bar"
////输出: false
////
//// 示例 3:
////
//// 输入: s = "paper", t = "title"
////输出: true
////
//// 说明:
////你可以假设 s 和 t 具有相同的长度。
//// Related Topics 哈希表
//// 👍 233 👎 0
//
//
//import java.util.HashMap;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        System.out.println(new Solution().isIsomorphic("ab", "aa"));
//
////        System.out.println(new Solution().isIsomorphic("egg", "add"));
////
////        System.out.println(new Solution().isIsomorphic("paper", "title"));
////
////        System.out.println(new Solution().isIsomorphic("foo", "bar"));
//    }
//
//    public boolean isIsomorphic(String s, String t) {
//        return isIsomor(s,t) && isIsomor(t,s);
//    }
//
//    public boolean isIsomor(String s, String t) {
//        HashMap<Character, Character> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ss = s.charAt(i);
//            char ts = t.charAt(i);
//            if(map.containsKey(ss)) {
//                if(map.get(ss) != ts) {
//                    return false;
//                }
//            }else {
//                map.put(ss, ts);
//            }
//        }
//        return true;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
