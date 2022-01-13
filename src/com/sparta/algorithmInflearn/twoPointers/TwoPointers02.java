package com.sparta.algorithmInflearn.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 공통원소 구하기
public class TwoPointers02 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);   // 오름차순 정렬
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {   // 같을때
                answer.add(a[p1++]);   // p1이나 p2 아무거나 answer에 추가, p1 p2 둘 다 증가
                p2++;
            } else if (a[p1] < b[p2]) p1++;   // p1이 p2보다 작으면 p1 증가
            else p2++;   // 아니면 p2 증가
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPointers02 T = new TwoPointers02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}
