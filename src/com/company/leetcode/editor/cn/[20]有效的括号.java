//package com.company.leetcode.editor.cn;
////给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
////
//// 有效字符串需满足：
////
////
//// 左括号必须用相同类型的右括号闭合。
//// 左括号必须以正确的顺序闭合。
////
////
//// 注意空字符串可被认为是有效字符串。
////
//// 示例 1:
////
//// 输入: "()"
////输出: true
////
////
//// 示例 2:
////
//// 输入: "()[]{}"
////输出: true
////
////
//// 示例 3:
////
//// 输入: "(]"
////输出: false
////
////
//// 示例 4:
////
//// 输入: "([)]"
////输出: false
////
////
//// 示例 5:
////
//// 输入: "{[]}"
////输出: true
//// Related Topics 栈 字符串
//// 👍 1685 👎 0
//
//
//import java.util.HashMap;
//import java.util.Stack;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    HashMap<Character, Character> brackets = new HashMap<>();
//
//    Solution() {
//        brackets.put(')', '(');
//        brackets.put('}', '{');
//        brackets.put(']', '[');
//    }
//
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (this.brackets.containsKey(c)) { // 右括号
//                char topElement = stack.empty() ? '#' : stack.pop();
//                if (topElement != this.brackets.get(c)) {
//                    return false;
//                }
//            } else {
//                // If it was an opening bracket, push to the stack.
//                stack.push(c);
//            }
//        }
//        return stack.isEmpty();
//    }
//
//
////    public boolean isValid(String s) {
////            brackets.put('(',')');
////            brackets.put('{','}');
////            brackets.put('[',']');
////        Stack<Character> stacks = new Stack<Character>();
////        for (int i = 0; i < s.length(); i++) {
////            char charValue = s.charAt(i);
////            if(' ' == charValue) {
////                continue;
////            }
////            if(brackets.containsKey(charValue)) { // 左括号
////                stacks.push(charValue);
////            }else{ // 右括号
////                if(stacks.empty()) {
////                    return false;
////                }
////                Character last = stacks.peek();
////                Character rightBrackets = brackets.get(last);
////                if(rightBrackets == charValue) {
////                    stacks.pop();
////                }else {
////                    return false;
////                }
////            }
////        }
////        return stacks.empty();
////    }
//    }
////leetcode submit region end(Prohibit modification and deletion)
