//package com.company.leetcode.editor.cn;
////给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
////
//// 示例:
////
//// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
////输出:
////[
////  ["ate","eat","tea"],
////  ["nat","tan"],
////  ["bat"]
////]
////
//// 说明：
////
////
//// 所有输入均为小写字母。
//// 不考虑答案输出的顺序。
////
//// Related Topics 哈希表 字符串
//// 👍 396 👎 0
//
//
//import java.lang.reflect.Array;
//import java.util.*;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//
//    public static void main(String[] args) {
//        String[] strings = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> res = new Solution().groupAnagrams(strings);
//        for (int i = 0; i < res.size() ; i++) {
//            List<String> oneLine = res.get(i);
//            for (int j = 0; j < oneLine.size(); j++) {
//                String ontItem = oneLine.get(j);
//                System.out.print(ontItem + ",");
//            }
//            System.out.println();
//        }
//    }
//
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> res = new ArrayList<>();
//        if(strs.length == 0) {
//            return res;
//        }
//        HashMap<String, List<String>> temp = new HashMap<>();
//        for (int i = 0; i < strs.length; i++) {
//            char[] chars = strs[i].toCharArray();
//            Arrays.sort(chars);
//            String iTemp = String.copyValueOf(chars);
//            List<String> strings = temp.getOrDefault(iTemp, new ArrayList<>());
//            strings.add(strs[i]);
//            temp.put(iTemp, strings);
//        }
//        return new ArrayList<>(temp.values());
//    }
//
//
//
////    public List<List<String>> groupAnagrams(String[] strs) {
////        if(strs.length == 0) {
////            return new ArrayList<>();
////        }
////
////        HashMap<String, List<String>> key = new HashMap<>();
////        for (String temp : strs) {
////            char[] sortArray = temp.toCharArray();
////            Arrays.sort(sortArray);
////            String sortTemp = String.valueOf(sortArray);
////            List<String> keyList;
////            if (key.containsKey(sortTemp)) {
////                keyList = key.get(sortTemp);
////            } else {
////                keyList = new ArrayList<>();
////                key.put(sortTemp, keyList);
////            }
////            keyList.add(temp);
////        }
////        return new ArrayList<List<String>>(key.values());
//////        List<List<String>> res = new ArrayList<>();
//////        for (Map.Entry<String, List<String>> keyTemp:key.entrySet()) {
//////            res.add(keyTemp.getValue());
//////        }
//////        return res;
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
