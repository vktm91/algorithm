package com.sparta.algorithmInflearn.sorting;

import java.util.Scanner;

// 버블정렬
public class Sorting02 {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {   // i는 턴의 횟수, 한번 턴마다 맨마지막 수가 결정된다
            for (int j = 0; j < n - i - 1; j++) {   // i가 1씩 커짐에따라 j는 1씩 감소
                if (arr[j] > arr[j + 1]) {   // j와 j+1 비교하며 교환, 더 큰 숫자가 뒤로
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Sorting02 T = new Sorting02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
