//package com.company.leetcode.editor.cn;
////n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
////
////
////
//// 上图为 8 皇后问题的一种解法。
////
//// 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
////
//// 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
////
////
////
//// 示例：
////
//// 输入：4
////输出：[
//// [".Q..",  // 解法 1
////  "...Q",
////  "Q...",
////  "..Q."],
////
//// ["..Q.",  // 解法 2
////  "Q...",
////  "...Q",
////  ".Q.."]
////]
////解释: 4 皇后问题存在两个不同的解法。
////
////
////
////
//// 提示：
////
////
//// 皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
////
//// Related Topics 回溯算法
//// 👍 653 👎 0
//
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//
////    public List<List<String>> solveNQueens(int n) {
////
////    }
//
//    public static void main(String[] args) {
//        int n = 4;
//        List<List<String>> res = new Solution().solveNQueens(n);
//        for (List<String> solution : res) {
//            for (int i = 0; i < solution.size(); i++) {
//                String item = solution.get(i);
//                System.out.println(item);
//            }
//            System.out.println("----------------");
//        }
//        System.out.println();
//    }
//
//    private List<int[][]> res = new ArrayList<>();
//
//    public List<List<String>> solveNQueens(int n) {
//        helper(new int[n][n], 0, n);
//        List<List<String>> out = new ArrayList<>();
//        for (int[][] resTemp : res) {
//            List<String> resString = new ArrayList<>();
//            for (int i = 0; i < resTemp.length; i++) {
//                int[] row = resTemp[i];
//                StringBuilder builder = new StringBuilder();
//                for (int j = 0; j < row.length; j++) {
//                    int value = row[j];
//                    builder.append(value == 0 ? "." : "Q");
//                }
//                resString.add(builder.toString());
//            }
//            out.add(resString);
//        }
//        return out;
//    }
//
//
//    private final HashSet<Integer> column = new HashSet<>();
//    private final HashSet<Integer> pie = new HashSet<>();
//    private final HashSet<Integer> na = new HashSet<>();
//
//    private void helper(int[][] current, int row, int n) {
//        // termination
//        if (row >= n) {
//            int[][] copy = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                System.arraycopy(current[i], 0, copy[i], 0, n);
//            }
//            res.add(copy);
//            return;
//        }
//        // process current logic
//        for (int i = 0; i < n; i++) {
//            Integer col = i;
//            Integer pi = row + i;
//            Integer naV = row - i;
//            if (!column.contains(col) && !pie.contains(pi) && !na.contains(naV)) {
//                column.add(col);
//                pie.add(pi);
//                na.add(naV);
//                current[row][i] = 1;
//                helper(current, row + 1, n);
//                column.remove(col);
//                pie.remove(pi);
//                na.remove(naV);
//                current[row][i] = 0;
//            }
//        }
//
//        // drill down
//
//        // restore current states
//    }
//
//
////    private List<int[][]> res = new ArrayList<>();
//
////    public List<List<String>> solveNQueens(int n) {
////        solveNQ(n);
////        List<List<String>> out = new ArrayList<>();
////
////        for (int[][] resTemp: res) {
////            List<String> resString = new ArrayList<>();
////            for (int i = 0; i < resTemp.length; i++) {
////                int[] row = resTemp[i];
////                StringBuilder builder = new StringBuilder();
////                for (int j = 0; j < row.length; j++) {
////                    int value = row[j];
////                    builder.append(value == 0 ? "." : "Q");
////                }
////                resString.add(builder.toString());
////            }
////            out.add(resString);
////        }
////        return out;
////    }
////
////    private List<int[][]> solveNQ(int n) {
////        return res;
////    }
//
//
////    private Set<Integer> columnSet = new HashSet<>();
////    private Set<Integer> pie = new HashSet<>();
////    private Set<Integer> na = new HashSet<>();
//
////    public List<List<String>> solveNQueens(int n) {
////        helper(new int[n][n], n, 0);
////        List<List<String>> out = new ArrayList<>();
////
////        for (int[][] resTemp: res) {
////            List<String> resString = new ArrayList<>();
////            for (int i = 0; i < resTemp.length; i++) {
////                int[] row = resTemp[i];
////                StringBuilder builder = new StringBuilder();
////                for (int j = 0; j < row.length; j++) {
////                    int value = row[j];
////                    builder.append(value == 0 ? "." : "Q");
////                }
////                resString.add(builder.toString());
////            }
////            out.add(resString);
////        }
////        return out;
////    }
////
////    private void helper(int[][] current, int n, int row) {
////        if (row >= n) {
////            int[][] copy = new int[n][n];
////            for (int i = 0; i < n; i++) {
////                System.arraycopy(current[i], 0, copy[i], 0, n);
////            }
////            res.add(copy);
////            return;
////        }
////        for (int i = 0; i < n; i++) {
////            if (!columnSet.contains(i) && !pie.contains(row + i) && !na.contains(row - i)) {
////                current[row][i] = 1;
////                columnSet.add(i);
////                pie.add(row + i);
////                na.add(row - i);
////                helper(current, n, row + 1);
////                columnSet.remove(i);
////                pie.remove(row + i);
////                na.remove(row - i);
////                current[row][i] = 0;
////            }
////        }
////    }
//
//
////    public List<List<String>> solveNQueens(int n) {
////        List<List<String>> res = new ArrayList<>();
////        helper(res, n, 0, new ArrayList<>());
////        List<List<String>> res1 = new ArrayList<>();
////        String oneLine = "";
////        for (List<String> solution : res) {
////            List<String> oneSo = new ArrayList<>();
////            for (int i = 0; i < solution.size(); i++) {
////                String item = solution.get(i);
////                oneLine += item;
////                if (i % n == n - 1) {
////                    oneSo.add(oneLine);
////                    oneLine = "";
////                }
////            }
////            res1.add(oneSo);
////        }
////        return res1;
////    }
////
////    private void helper(List<List<String>> res, int n, int row, List<String> current) {
////        // terminal
////        if (row >= n) {
////            res.add(current);
////            return;
////        }
////        //progress
////        for (int i = 0; i < n; i++) {
////            if (columnSet.contains(i) || pie.contains(row + i) || na.contains(row - i)) {
////                current.add(".");
////                continue;
////            }
////            current.add("Q");
////            for (int j = i + 1; j < n; j++) {
////                current.add(".");
////            }
//////            current.add("\n");
////
////            columnSet.add(i);
////            pie.add(row + i);
////            na.add(row - i);
////            helper(res, n, row + 1, new ArrayList<>(current));
////            columnSet.remove(i);
////            pie.remove(row + i);
////            na.remove(row - i);
////            for (int j = i; j < n; j++) {
////                current.remove(current.size() - 1);
////            }
////            current.add(".");
////        }
////
////        //down
////
////        // reverse
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
