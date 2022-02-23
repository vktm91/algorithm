package com.sparta.algorithmInflearn.sorting;

import java.util.Scanner;

// 삽입정렬
public class Sorting03 {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {   // i와 앞의 값을 비교해야하니 i는 1부터!!
            int tmp = arr[i], j;   // j를 for문 밖에서도 사용하기때문에 여기에 선언
            for (j = i - 1; j >= 0; j--) {   // j는 i앞의 값부터 0까지
                if (arr[j] > tmp) arr[j + 1] = arr[j];   // 비교해서 큰값이면 교환
                else break;   // 크지않으면 중단 (앞은 다 정렬된 상태임)
            }
            arr[j + 1] = tmp;   // j가 멈춘지점 +1에 tmp 삽입
        }
        return arr;
    }

    public static void main(String[] args) {
        Sorting03 T = new Sorting03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}

