package com.sparta.algorithmInflearn.sorting;

import java.util.Scanner;

// LRU(캐시)
public class Sorting04 {
    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;   // 캐시에 작업이 있으면(히트이면) i대입
            if (pos == -1) {   // 미스 상황이면 다 땡긴다
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];   // i지점에 i-1을 대입하니 떙기는게됨
                }
            } else {   // 히트면 pos 지점부터 땡겨주면 됨
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        Sorting04 T = new Sorting04();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
}