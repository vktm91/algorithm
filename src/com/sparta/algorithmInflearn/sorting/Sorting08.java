package com.sparta.algorithmInflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 이분검색
public class Sorting08 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);   // 이분검색은 먼저 정렬이 돼있어야 한다
        int lt = 0, rt = n - 1;
        while (lt <= rt) {   // lt가 rt보다 커지면 답이 없는것이니 멈춰야함
            int mid = (lt + rt) / 2;   // int 나누기 int 니까 몫만남음
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) rt = mid - 1;   // 값을 비교하여 rt나 lt의 위치 조정
            else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sorting08 T = new Sorting08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
