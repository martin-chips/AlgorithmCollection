package com.dimple.algorithmCollection.GodNiu.java;

import java.util.Arrays;

/**
 * 插入排序：扑克牌，左边的数都是有序的，从右边的第一个数拿来和左边的数进行排序。使得左边的数始终都是有序的
 */
public class Code_03_InsertSort {
    /**
     * 插入排序
     *
     * @param array 目标数组
     */
    public static void insertSort(int[] array) {
//        参数合法性校验
        if (array == null || array.length < 2) {
            return;
        }
        //外层循环，控制的需要进行插入的数的位置
        for (int i = 1; i < array.length; i++) {
            //内层循环，将当前这个数拿到有序祖列中进行遍历，找到它的合适位置
            for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j--) {
                swap(array, j, j + 1);
            }
        }
    }

    /**
     * 交换函数
     *
     * @param array 目标数组
     * @param i     需要交换的下标位置
     * @param j     需要交换的下标位置
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int array[] = {4, 3, 5, 6, 2};
        insertSort(array);
        System.out.println(Arrays.asList(array));
    }
}
