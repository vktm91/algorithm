package com.sparta.algorithmInflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 마구간 정하기(결정알고리즘)
public class Sorting10 {
    public int count(int[] arr, int dist) {
        int cnt = 1;   // cnt: 배치한 말 마리수
        int ep = arr[0];   // 제일 마지막으로 배치된 좌표
        for (int i = 1; i < arr.length; i++) {   // 0번 인덱스는 배치했고 1번부터
            if (arr[i] - ep >= dist) {   // arr[i]지점에 배치할 수 있는지 판별, ep를 뺀 거리가 dist(mid)보다 큰지 확인
                cnt++;
                ep = arr[i];   // 배치
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;    // 첫번째 좌표값이 1이라서가 아니라 최소거리를 의미
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {   // mid에 따른 리턴값(배치가능한 마리수)이 c(배치해야할 마리수)이상인지 판별
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sorting10 T = new Sorting10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }
}
