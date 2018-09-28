package com.dimple.algorithmCollection.niukewang.offer;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Dimple09JumpFloorII {
    public static int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        }
        return 2 * JumpFloorII(target - 1);
    }

    public static int JumpFloorII2(int target) {
        if (target <= 2) {
            return target;
        }
        int currentNum = 2;
        for (int i = 2; i < target; i++) {
            currentNum = 2 * currentNum;
        }
        return currentNum;
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII2(4));
    }
}
