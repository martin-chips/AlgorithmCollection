package com.dimple.algorithmCollection.baicizhan;

import java.util.Scanner;

/**
 * 素数指整数在一个大于1的自然数中，除了1和此整数自身外，没法被其他自然数整除的数。
 */
public class PrimeNum {

    public static boolean isPrimeNum(int num) {
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPrimeNum(num));
    }
}
