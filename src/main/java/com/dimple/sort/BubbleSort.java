package com.dimple.sort;

/**
 * @className: BubbleSort
 * @description: 冒泡排序
 * @auther: Owenb
 * @date: 02/27/19
 * @version: 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 6, 8, 3, 5, 4};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {//外层循环控制趟数
            for (int j = 0; j < arr.length - i - 1; j++) {//内层循环控制每一趟交换的次数
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);//交换
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
