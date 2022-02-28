package com.sparta.algorithmInflearn.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 장난꾸러기
public class Sorting06 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();   // 깊은 복사를 해야 tmp를 정렬해도 arr 배열은 그대로 있게된다
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) answer.add(i + 1);  // arr와 정렬한 tmp 비교
        }
        return answer;
    }

    public static void main(String[] args) {
        Sorting06 T = new Sorting06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
