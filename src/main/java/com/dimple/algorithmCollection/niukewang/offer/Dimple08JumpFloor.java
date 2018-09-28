package com.dimple.algorithmCollection.niukewang.offer;

/**
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Dimple08JumpFloor {
    /**
     * 如果青蛙第一次跳1阶，那么剩下了n-1阶，有f(n-1)种解法
     * 如果小青蛙第一次跳了2阶，剩下了n-2阶，有f(n-2)种解法
     * 那么总跳法为f(n-1)+f(n-2)
     * 递归算法
     *
     * @param target
     * @return
     */
    public static int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        }
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }


    public static int jumpFloor2(int target) {
        if (target <= 2) {
            return target;
        }
        int currentNum = 2;
        int preNum = 1;
        for (int i = 2; i < target; i++) {
            currentNum += preNum;
            preNum = currentNum - preNum;
        }
        return currentNum;
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor2(4));
    }
}
