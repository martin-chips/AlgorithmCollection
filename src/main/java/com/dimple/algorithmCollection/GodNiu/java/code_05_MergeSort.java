package com.dimple.algorithmCollection.GodNiu.java;

import sun.misc.LRUCache;

/**
 * 归并排序，采用的是分治的实现
 */
public class code_05_MergeSort {
    /**
     * 传入参数合法性校验，然后调用归并排序的方法
     *
     * @param array 目标数组
     */
    public static void mergeSort(int array[]) {
        if (array == null || array.length < 2) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    /**
     * 归并排序的实现，这里用到的是分治的思想
     *
     * @param array
     * @param left
     * @param right
     */
    private static void sort(int[] array, int left, int right) {
        //递归终止条件
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        sort(array, left, mid);
        sort(array, mid + 1, right);
        //归并
        merge(array, left, right);
    }

    /**
     * 归并算法
     *
     * @param array
     * @param left
     * @param right
     */
    private static void merge(int[] array, int left, int right) {
        int mid = left + ((right - left) >> 1);//防止因为left和right太大导致的integer越界，相当于left+(right-left)/2
        int[] help = new int[right - left + 1];//建立辅助数组
        int i = 0;
        int p1 = left;//p1指向left的数组第一个
        int p2 = mid + 1;//p2指向right数组的第一个
        while (p1 <= mid && p2 <= right) {
            //比较，谁小填入辅助数组
            help[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }
        //上面的while循环结束，当且只当p1和p2有一个越界，下面的两个while是将剩下的数组数据填到辅助数组
        while (p1 <= mid) {
            help[i++] = array[p1++];
        }
        while (p2 <= right) {
            help[i++] = array[p2++];
        }
        //数据回填，将辅助数组的数据回填到原数组
        for (i = 0; i < help.length; i++) {
            array[left + i] = help[i];
        }
    }

    public static void main(String[] args) {
        int array[] = {4, 3, 6, 1, 7};
        mergeSort(array);
        System.out.println();
    }
}
