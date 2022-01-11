package com.sparta.algorithmInflearn.array;

import java.util.Scanner;

// 멘토링
public class Array12 {
    public int solution(int n, int m, int[][] arr) {   // n은 학생수, m은 테스트 횟수
        int answer = 0;
        for (int i = 1; i <= n; i++) {   // 멘토 i학생 1~4
            for (int j = 1; j <= n; j++) {   // 멘티 j학생 1~4
                int cnt = 0;
                for (int k = 0; k < m; k++) {   // 테스트 0~2
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {   // 등수(배열에서 순서) 찾기
                        if (arr[k][s] == i) pi = s;   // i학생 등수
                        if (arr[k][s] == j) pi = s;   // j학생 등수
                    }
                    if (pi < pj) cnt++;   // i학생의 등수가 j학생의 등수보다 앞설때 카운트
                }
                if (cnt == m) {
                    answer++;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array12 T = new Array12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}
