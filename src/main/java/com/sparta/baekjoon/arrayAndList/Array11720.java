package com.sparta.baekjoon.arrayAndList;

import java.util.Scanner;

// Baekjoon No.11720
public class Array11720 {
    public static void main(String[] args) {
        firstTry();
    }

    private static void firstTry() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int target = kb.nextInt();
        int sum = 0;

        for (int i = n; i > 0; i--) {
            double square = Math.pow(10, i);

            int result = (int) (target / square * 10);

            sum += result;

            target -= result * (square / 10);
        }

        System.out.println(sum);
    }
}
