package com.dimple.algorithmCollection.niukewang.offer;

import java.lang.annotation.ElementType;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Dimple07Fibonacci {
    /**
     * 斐波那契的递归实现
     *
     * @param n
     * @return
     */
    public static int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    /**
     * 斐波那契的非递归实现
     *
     * @return
     */
    public static int Fibonacci1(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        int currentNum = 1;
        int preNum = 1;
        for (int i = 2; i < n; i++) {
            currentNum += preNum;
            preNum = currentNum - preNum;
        }
        return currentNum;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci1(4));
    }
}
