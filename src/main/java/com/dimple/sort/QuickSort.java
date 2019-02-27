package com.dimple.sort;

/**
 * @className: QuickSort
 * @description: 快排
 *  实现原理：找数组中第一个元素作为基准X，将这个X挖为坑，首先从右向左找第一个小于等于X的数，将这个数填到之前X的坑，这个时候这个数本身的位置又是一个坑，然后从左向右找大于等于X的数，找到了，然后将该处的数填到上一个坑中，如此往复；直到最后i==j，然后将X填到最后的一个坑中，此时，这个X左边的数都小于X，右边的数都大于X；然后采用分治，对左右两边的数进行递归；
 * @auther: Owenb
 * @date: 02/27/19
 * @version: 1.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 45, 76, 764, 32, 9};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            //递归调用
            int partition = partition(arr, start, end);
            quickSort(arr,start,partition-1);
            quickSort(arr,partition+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        //设置第一个数为基准
        int key = arr[start];

        while (start < end) {
            while (arr[end] >= key && start < end) {
                end--;
            }
            //填第一个坑
            arr[start] = arr[end];
            while (arr[end] <= key && start < end) {
                start++;
            }
            //填上一个坑，同时挖出当前这一个坑
            arr[end] = arr[start];
        }

        //找坑完毕,回填坑
        arr[start] = key;
        return start;
    }
}
