package com.sparta.algorithmInflearn.sorting;

import java.util.Scanner;

// 선택정렬
public class Sorting01 {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {   // i를 뒤엣 값 j와 비교해서 교환하는는방식이니 i가 마지막값까지 갈필요없음
            int idx = i;   // idx에 제일 작은 값의 인덱스번호 저장
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Sorting01 T = new Sorting01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }

}
