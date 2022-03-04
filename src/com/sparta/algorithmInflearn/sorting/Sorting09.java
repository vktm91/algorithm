package com.sparta.algorithmInflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 뮤직비디오(결정알고리즘)
public class Sorting09 {   // 결정알고리즘은 이분검색을 사용하게되는데, lt와 rt사이에 답이 있는 경우만 적용 가능하다
    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;   // cnt는 dvd장수, sum은 곡들 길이의 합
        for (int x : arr) {
            if (sum + x > capacity) {   // sum의 합이 dvd한장의 용량을 넘어가버리면
                cnt++;   // 한장 증가
                sum = x;   // 누적되지 못하는 크기의 곡은 새로운 장에 다시 시작해야되니 sum으로 초기화
            } else sum += x;   // 용량 넘어가지 않으면 누적
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        // 가장 큰 곡을 최소값 lt로, 모든 곡을 합친 값을 최대값 rt로 잡는다
        int lt = Arrays.stream(arr).max().getAsInt();   // stream 반복자의 메소드 max 이용하여 최대값 구한다 // max()의 리턴형이 그냥 int가 아니고 옵셔널 인트 형이기 때문에 int로 변환하는 getAsInt까지 사용한다
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {   // count 메서드 사용하여 dvd에 담기는지 용량 확인
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sorting09 T = new Sorting09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}