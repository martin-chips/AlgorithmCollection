package com.dimple.algorithmCollection.baicizhan;

import java.util.Scanner;

/**
 * 题目描述：
 * 给定n个整数，从其中选出一些数（至少一个），判断他们的和是否可以为k
 * 输入描述：
 * 输入为三行，第一行为整数n；第二行为n个整数；第三行为整数k。其中：0<n<10
 * 输入描述：
 * 输出为一行，true或者false，true代表能够满足；false代表不能。
 * 示例：
 * 5
 * 1 2 0 -1 4
 * 3
 * 输出：
 * true
 */
public class getSumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(doDFS(1, 0, array, target));
    }

    private static boolean doDFS(int i, int sum, int[] array, int target) {
        if (i == array.length + 1) {
            return sum == target;
        }
        return false;
    }


}
