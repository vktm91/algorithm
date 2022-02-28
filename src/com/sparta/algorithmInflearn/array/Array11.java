package com.sparta.algorithmInflearn.array;

import java.util.Scanner;

// 임시반장 정하기
public class Array11 {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {   // i번 학생 기준
            int cnt = 0;
            for (int j = 1; j <= n; j++) {   // 비교대상 j번 학생
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {   // i번 학생의 k학년의 반과 j번 학생의 k학년의 반 비교
                        cnt++;
                        break;   // k학생과 두번이상 같은반이었어도 한번만 카운팅 돼야하니 break
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array11 T = new Array11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n + 1][6];   // 1번부터 시작
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
