//package com.company.leetcode.editor.cn;
////给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
////
//// 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
////
//// 示例:
////
//// X X X X
////X O O X
////X X O X
////X O X X
////
////
//// 运行你的函数后，矩阵变为：
////
//// X X X X
////X X X X
////X X X X
////X O X X
////
////
//// 解释:
////
//// 被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被
////填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
//// Related Topics 深度优先搜索 广度优先搜索 并查集
//// 👍 355 👎 0
//
//
//import java.util.HashSet;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        char[][] board = {
//                {'X', 'X', 'X', 'X'},
//                {'X', 'O', 'O', 'X',},
//                {'X', 'X', 'O', 'X',},
//                {'X', 'O', 'X', 'X',}
//        };
//
//        char[][] board1 = {
//                {'X', 'O', 'X', 'X'},
//                {'O', 'X', 'O', 'X',},
//                {'X', 'O', 'X', 'O',},
//                {'O', 'X', 'O', 'X',}
//        };
//        new Solution().solve(board);
//        for (int i = 0; i < board.length; i++) {
//            char[] row = board[i];
//            for (int j = 0; j < row.length; j++) {
//                System.out.print(board[i][j] + ",");
//            }
//            System.out.println();
//        }
//    }
//
//    public void solve(char[][] board) {
//        int row = board.length;
//        if(row == 0) {
//            return;
//        }
//        int column = board[0].length;
//        if(column <= 1) {
//            return;
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                dfs(board, null, i, j, column);
//            }
//        }
//    }
//
//    /***
//     * left, top, right, bottom
//     */
//    int[] x = {-1, 0, 1, 0};
//    int[] y = {0, 1, 0, -1};
//
//    /**
//     * @param board
//     * @param visited
//     * @param i
//     * @param j
//     * @param column
//     * @return 子节点是否是封闭区间
//     */
//    private boolean dfs(char[][] board, HashSet<Integer> visited, int i, int j, int column) {
////        if (visited.contains(i * column + j)) {
////            return false;
////        }
////        visited.add(i * column + j);
//        boolean res = true;
//        if(i == 3 && j == 1) {
//            System.out.println();
//        }
//        char ori = board[i][j];
//        if (board[i][j] == 'O') {
//            // 边缘的O， 那么一定是不封闭的区间
//            if (i == 0 || i == board.length - 1 || j == 0 && j == column - 1) {
//                res = false;
//            } else {
//                board[i][j] = 'X';
//                for (int k = 0; k < x.length; k++) {
//                    int nextI = i + x[k];
//                    int nextJ = i + y[k];
//                    if(nextI >= 0 && nextI < board.length && nextJ >= 0 && nextJ < column) {
//                        res = res && dfs(board, visited, nextI, nextJ, column);
//                    }
//                }
//            }
//
//        }
//        if (!res) {
//            board[i][j] = ori;
//        }
//
//        return res;
//    }
//
//
////    public void solve(char[][] board) {
////        int row = board.length;
////        if(row <= 1) {
////            return;
////        }
////        int column = board[0].length;
////        UnionFind unionFind = new UnionFind(row * column + 1);
////        int dummyNode = row * column;
////
////        for (int i = 0; i < row; i++) {
////            for (int j = 0; j < column; j++) {
////                char ch = board[i][j];
////                if(i == 1 && j == 1) {
////                    System.out.println();
////                }
////                if (ch == 'O') {
////                    if (i == row - 1 || i == 0 || j == 0 || j == column - 1) {
////                        unionFind.union(nodeIndex(i, j, column), dummyNode);
////                    } else {
////                        if (board[i - 1][j] == 'O') {
////                            unionFind.union(nodeIndex(i, j, column), nodeIndex(i - 1, j, column));
////                        }
////                        if (board[i + 1][j] == 'O') {
////                            unionFind.union(nodeIndex(i, j, column), nodeIndex(i + 1, j, column));
////                        }
////                        if (board[i][j + 1] == 'O') {
////                            unionFind.union(nodeIndex(i, j, column), nodeIndex(i, j + 1, column));
////                        }
////                        if (board[i][j - 1] == 'O') {
////                            unionFind.union(nodeIndex(i, j, column), nodeIndex(i, j - 1, column));
////                        }
////                    }
////                }
////            }
////        }
////
////        for (int i = 0; i < row; i++) {
////            for (int j = 0; j < column; j++) {
////                int p = unionFind.findParent(nodeIndex(i, j, column));
////                int q = unionFind.findParent(dummyNode);
////                if (p == q) {
////                    board[i][j] = 'O';
////                } else {
////                    board[i][j] = 'X';
////                }
////            }
////        }
////
////    }
////
////    private int nodeIndex(int i, int j, int column) {
////        return i * column + j;
////    }
////
////    class UnionFind {
////        int[] parent;
////        int count;
////
////        UnionFind(int n) {
////            count = n;
////            parent = new int[n];
////            for (int i = 0; i < n; i++) {
////                parent[i] = i;
////            }
////        }
////
////        public int findParent(int p) {
////            while (p != parent[p]) {
////                parent[p] = parent[parent[p]];
////                p = parent[p];
////            }
////            return p;
////        }
////
////        public void union(int p, int q) {
////            int parentP = findParent(p);
////            int parentQ = findParent(q);
////            if (parentP == parentQ) {
////                return;
////            }
////            parent[parentP] = parentQ;
////        }
////    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
