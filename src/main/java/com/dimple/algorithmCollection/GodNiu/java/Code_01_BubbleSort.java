package com.dimple.algorithmCollection.GodNiu.java;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Code_01_BubbleSort {
    /**
     * 冒泡函数
     *
     * @param array 目标数组
     */
    public static void bubbleSort(int array[]) {
        //输入合法性校验，如果是空数组或者数组只有一个数，那么不需要排序，直接返回
        if (array == null || array.length < 2) {
            return;
        }
        //外层循环控制需要排序的数列，从0到i
        for (int i = array.length - 1; i > 0; i--) {
            //内层循环进行比较
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换函数
     *
     * @param array 目标数组
     * @param i     交换的数组的下标
     * @param j     交换的数组的下标
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int array[] = {4, 3, 5, 6, 2};
        bubbleSort(array);
        System.out.println(Arrays.asList(array));
    }
}
