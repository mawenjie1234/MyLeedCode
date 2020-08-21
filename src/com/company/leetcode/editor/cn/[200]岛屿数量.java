//package com.company.leetcode.editor.cn;
////给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
////
//// 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
////
//// 此外，你可以假设该网格的四条边均被水包围。
////
////
////
//// 示例 1:
////
//// 输入:
////[
////['1','1','1','1','0'],
////['1','1','0','1','0'],
////['1','1','0','0','0'],
////['0','0','0','0','0']
////]
////输出: 1
////
////
//// 示例 2:
////
//// 输入:
////[
////['1','1','0','0','0'],
////['1','1','0','0','0'],
////['0','0','1','0','0'],
////['0','0','0','1','1']
////]
////输出: 3
////解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
////
//// Related Topics 深度优先搜索 广度优先搜索 并查集
//// 👍 681 👎 0
//
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    public static void main(String[] args) {
////        char[][] grid = {
////                {'1', '1', '1', '1', '1', '1', '1'},
////                {'0', '0', '0', '0', '0', '0', '1'},
////                {'1', '1', '1', '1', '1', '0', '1'},
////                {'1', '0', '0', '0', '1', '0', '1'},
////                {'1', '0', '1', '0', '1', '0', '1'},
////                {'1', '0', '1', '1', '1', '0', '1'},
////                {'1', '1', '1', '1', '1', '1', '1'},
////
////        };
////        char[][] grid1 = {
////                {'1', '1', '1', '1', '0'},
////                {'1', '1', '0', '1', '0'},
////                {'1', '1', '0', '0', '0'},
////                {'0', '0', '0', '0', '0'}
////        };
////        char[][] grid2 = {
////                {'1', '1', '0', '0', '0'},
////                {'1', '1', '0', '0', '0'},
////                {'0', '0', '1', '0', '0'},
////                {'0', '0', '0', '1', '1'}
////        };
////
//////        System.out.println(new Solution().numIslands1(grid2));
////
////        System.out.println(new Solution().numIslands(grid1));
////    }
//
//    public int numIslands(char[][] grid) {
//        int row = grid.length;
//        if (row == 0) {
//            return 0;
//        }
//        int column = grid[0].length;
//        if (column == 0) {
//            return 0;
//        }
//        UnionFind find = new UnionFind(row * column + 1);
//        int waterPoint = row * column;
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                if (grid[i][j] == '0') {
//                    find.union(i * column + j, waterPoint);
//                } else {
//
//                    if (i + 1 < row && grid[i + 1][j] == '1') {
//                        find.union(i * column + j, (i + 1) * column + j);
//                    }
//                    if (j + 1 < column && grid[i][j + 1] == '1') {
//                        find.union(i * column + j, i * column + j + 1);
//                    }
//                }
//            }
//        }
//
//        return find.count - 1;
//    }
//
//    private class UnionFind {
//        int[] parent;
//        int count = 0;
//
//        public UnionFind(int n) {
//            parent = new int[n];
//            count = n;
//            for (int i = 0; i < n; i++) {
//                parent[i] = i;
//            }
//        }
//
//        public int findParent(int p) {
//            while (p != parent[p]) {
//                parent[p] = parent[parent[p]];
//                p = parent[p];
//            }
//            return p;
//        }
//
//        public void union(int p, int q) {
//            int parentP = findParent(p);
//            int parentQ = findParent(q);
//            if (parentP == parentQ) {
//                return;
//            }
//            parent[parentQ] = parentP;
//            count--;
//        }
//
//
//    }
//
//
//    public int numIslands1(char[][] grid) {
//        if (grid == null || grid.length == 0) {
//            return 0;
//        }
//        int nr = grid.length;
//        int nc = grid[0].length;
//        int count = 0;
//
//        for (int r = 0; r < nr; r++) {
//            for (int c = 0; c < nc; c++) {
//                if (grid[r][c] == '1') {
//                    count++;
//                    grid[r][c] = '0';
//                    Queue<Integer> neighbors = new LinkedList<>();
//                    neighbors.add(r * nc + c);
//                    while (!neighbors.isEmpty()) {
//                        int id = neighbors.remove();
//                        int row = id / nc;
//                        int column = id % nc;
//                        if (row - 1 >= 0 && grid[row - 1][column] == '1') { // top
//                            neighbors.add((row - 1) * nc + column);
//                            grid[row - 1][column] = '0';
//                        }
//                        if (row + 1 < nr && grid[row + 1][column] == '1') { // bottom
//                            neighbors.add((row + 1) * nc + column);
//                            grid[row + 1][column] = '0';
//                        }
//                        if (column - 1 >= 0 && grid[row][column - 1] == '1') { // left
//                            neighbors.add(row * nc + column - 1);
//                            grid[row][column - 1] = '0';
//                        }
//                        if (column + 1 < nc && grid[row][column + 1] == '1') { // right
//                            neighbors.add(row * nc + column + 1);
//                            grid[row][column + 1] = '0';
//                        }
//                    }
//                }
//            }
//        }
//        return count;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
