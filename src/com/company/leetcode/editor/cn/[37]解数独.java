//package com.company.leetcode.editor.cn;
////编写一个程序，通过已填充的空格来解决数独问题。
////
//// 一个数独的解法需遵循如下规则：
////
////
//// 数字 1-9 在每一行只能出现一次。
//// 数字 1-9 在每一列只能出现一次。
//// 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
////
////
//// 空白格用 '.' 表示。
////
////
////
//// 一个数独。
////
////
////
//// 答案被标成红色。
////
//// Note:
////
////
//// 给定的数独序列只包含数字 1-9 和字符 '.' 。
//// 你可以假设给定的数独只有唯一解。
//// 给定数独永远是 9x9 形式的。
////
//// Related Topics 哈希表 回溯算法
//// 👍 486 👎 0
//
//
//import java.util.*;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
////    public static void main(String[] args) {
////        char[][] board = {
////                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
////                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
////                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
////                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
////                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
////                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
////                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
////                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
////                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
////        };
////
////        new Solution().solveSudoku(board);
////        System.out.println("end");
////    }
//
//    int N = 10;
//    int[][] rowValue = new int[N][N];
//    int[][] columnValue = new int[N][N];
//    int[][] slideValue = new int[N][N];
//
//    public void solveSudoku(char[][] board) {
//
//        List<Integer> needCheck = new LinkedList<>();
//        for (int i = 0; i < board.length; i++) {
//            char[] row = board[i];
//            for (int j = 0; j < row.length; j++) {
//                char value = board[i][j];
//                if (value != '.') {
//                    int intValue = Character.getNumericValue(value);
//                    rowValue[i][intValue]++;
//                    columnValue[j][intValue]++;
//                    int slide = (i / 3) * 3 + j / 3;
//                    if(slide > 10) {
//                        System.out.println();
//                    }
//                    slideValue[slide][intValue]++;
//                }else {
//                    needCheck.add(i * 9 + j);
//                }
//            }
//        }
//        helper(board, needCheck, 0);
//    }
//
//    private boolean helper(char[][] board, List<Integer> needCheck, int index) {
//        if (index >= needCheck.size()) {
//            return true;
//        }
//
//        Integer checkIndex = needCheck.get(index);
//        int row = checkIndex / 9;
//        int column = checkIndex % 9;
//        if (board[row][column] == '.') {
//            for (int i = 1; i < 10; i++) {
//                int slide = (row / 3) * 3 + column / 3;
//                if (rowValue[row][i] == 0 && columnValue[column][i] == 0 && slideValue[slide][i] == 0) {
//                    board[row][column] = Character.forDigit(i, 10);
//                    rowValue[row][i]++;
//                    columnValue[column][i]++;
//                    slideValue[slide][i]++;
//                    boolean res = helper(board, needCheck, index + 1);
//                    if (!res) {
//                        board[row][column] = '.';
//                        rowValue[row][i]--;
//                        columnValue[column][i]--;
//                        slideValue[slide][i]--;
//                    } else {
//                        return true;
//                    }
//                }
//            }
//        } else {
//            // 不可能发生
//            System.out.println("error : " + row + "," + column);
//            helper(board, needCheck, index + 1);
//        }
//        return false;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
