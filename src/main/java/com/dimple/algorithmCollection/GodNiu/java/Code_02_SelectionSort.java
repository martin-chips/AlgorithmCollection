package com.dimple.algorithmCollection.GodNiu.java;

import java.util.Arrays;

/**
 * 选择排序
 */
public class Code_02_SelectionSort {
    /**
     * 选择排序
     *
     * @param array 目标数组
     */
    public static void selectionSort(int[] array) {
        //数组输入参数合法性校验
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                minIndex = array[j] < array[minIndex] ? j : minIndex;
            }
            swap(array, minIndex, i);
        }
    }

    /**
     * 交换
     * @param array 目标数组
     * @param minIndex 当前找到的最小的数的下标
     * @param i 要交换的数的下标
     */
    private static void swap(int[] array, int minIndex, int i) {
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
        int array[] = {4, 3, 5, 6, 2};
        selectionSort(array);
        System.out.println(Arrays.asList(array));
    }
}
