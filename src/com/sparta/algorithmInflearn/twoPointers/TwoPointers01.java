package com.sparta.algorithmInflearn.twoPointers;

import java.util.ArrayList;
import java.util.Scanner;

// 두 배열 합치기
public class TwoPointers01 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;   // 포인터 p1은 a배열, p2는 b배열의 첫번째자료를 가리키고있음
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);   // add(a[++p1])로 하면 add후 ++가 아니고 증가먼저하고 증가된 곳을 add하게됨
            else answer.add(b[p2++]);
        }
        while (p1 < n) answer.add(a[p1++]);   // 아직 안끝난쪽 배열 순서대로 넣어주면 됨
        while (p2 < m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        TwoPointers01 T = new TwoPointers01();
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
