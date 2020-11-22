package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
//        int a[] = new int[]{1,8,6,2,5,4,8,3,7};
//        int maxArea = maxArea(a);
//        System.out.println(maxArea);
//        climbStairs(4);

        // 283 zero move
//        MoveZeroSolution283 moveZeroSolution283 = new MoveZeroSolution283();
//        int []nums = new int[] {0,1,0,3,12};
//        moveZeroSolution283.moveZeroes(nums);

        float everyYearMoney = 25000;
        float totalMoney = everyYearMoney;
        float ratio = 0.1f;
        for (int i = 0; i < 10; i++) {
            totalMoney = calculate(totalMoney, ratio);
            totalMoney += everyYearMoney;
        }
        System.out.println(totalMoney);
    }

    private static float calculate(float memory, float ratio) {
        return memory * (1 + ratio);
    }

    public static synchronized int maxArea(int[] height) {
        if (height.length < 1) {
            return 0;
        }
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i<j ; ){
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxArea = Math.max(maxArea, (j - i + 1) * minHeight);
        }
        return maxArea;
    }

    // 爬楼梯
    public static int climbStairs(int n) {
        if(n < 3) {
            return n;
        }
        int f1 = 1, f2 = 2,f3 = 3;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
