//package com.company.leetcode.editor.cn;
////n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
////
////
////
//// 上图为 8 皇后问题的一种解法。
////
//// 给定一个整数 n，返回 n 皇后不同的解决方案的数量。
////
//// 示例:
////
//// 输入: 4
////输出: 2
////解释: 4 皇后问题存在如下两个不同的解法。
////[
//// [".Q..",  // 解法 1
////  "...Q",
////  "Q...",
////  "..Q."],
////
//// ["..Q.",  // 解法 2
////  "Q...",
////  "...Q",
////  ".Q.."]
////]
////
////
////
////
//// 提示：
////
////
//// 皇后，是国际象棋中的棋子，意味着国王的妻子。皇后只做一件事，那就是“吃子”。当她遇见可以吃的棋子时，就迅速冲上去吃掉棋子。当然，她横、竖、斜都可走一或 N
////-1 步，可进可退。（引用自 百度百科 - 皇后 ）
////
//// Related Topics 回溯算法
//// 👍 137 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public static void main(String[] args) {
//        System.out.println(new Solution().totalNQueens(4));
//    }
//
//    int count = 0;
//
//    public int totalNQueens(int n) {
//        if (n <= 1) {
//            return 0;
//        }
//        dfs(n, 0, 0, 0, 0);
//        return count;
//    }
//
//    private void dfs(int n, int row, int col, int pie, int na) {
//        // termination
//        if (row >= n) {
//            count++;
//            return;
//        }
//        // process current logic
//        int bits = (~(col | pie | na) & (1 << n) - 1); // 得到所有的空位置 , 可以放皇后的地方写1
//        // drill down
//        while (bits != 0) {
//            int p = bits & -bits; // 取得最低位置的1
//            bits = bits & (bits - 1); // 表示p 位置放上皇后, 清最低位的1
//            dfs(n, row + 1, col | p, (pie | p) << 1, (na | p) >> 1);
//        }
//
//        //restore current states
//    }
//
////    int count;
////    public int totalNQueens(int n) {
////        if (n < 1) {
////            return 0;
////        }
////        count = 0;
////        dfs(n, 0, 0, 0, 0);
////        return count;
////    }
////
////    private void dfs(int n, int row, int column, int pie, int na) {
////        if (row >= n) {
////            count++;
////            return;
////        }
////        int bits = (~(column | pie | na)) & ((1 << n) - 1);
////        while (bits != 0) {
////            int p = bits & -bits;
////            bits = bits & (bits - 1);
////            dfs(n, row + 1, column | p, (pie | p) << 1, (na | p) >> 1);
////        }
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
