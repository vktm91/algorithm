package com.sparta.algorithmInflearn.Array;

import java.util.Scanner;

// 소수(에라토스테네스 체)
public class Array05 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];   // n번 인덱스까지니까 n+1
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {   // i의 배수로 돌아야하니까 i씩 증가시킨다
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array05 T = new Array05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
