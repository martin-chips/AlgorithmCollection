package com.dimple.algorithmCollection.niukewang.offer;

import java.util.Scanner;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindMatrix {
    public static void main(String[] args) {
        int array[][] = {
                {}
//                {1, 2, 8, 9},
//                {2, 4, 9, 12},
//                {4, 7, 10, 13},
//                {6, 8, 11, 15}
        };
        int target = 16;
        System.out.println(find(target, array));
    }

    private static boolean find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = array.length - 1;
        while (row < array.length && col >= 0) {
            int temp = array[row][col];
            if (temp == target) {
                return true;
            } else if (target < temp) {
                col--;
            } else if (target > temp) {
                row++;
            }
        }
        return false;
    }

}
