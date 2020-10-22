package com.wsm.leetcode.medium;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */
public class PowxN {


    public static void main(String[] args) {


        double x = new PowxN().myPow(2, 4);

    }


    /**
     * 分治、递归
     * Math.pow(x,n);
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        if (n % 2 > 0) {
            return x * myPow(x, n - 1);
        }
        return myPow(x * x, n / 2);
    }


}
