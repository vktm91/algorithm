package com.sparta.algorithmInflearn.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 중복확인
public class Sorting05 {
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);   // 오름차순 정렬 해놓고
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]) return "D";  // 같은지 체크
        }
        return answer;
    }

    public static void main(String[] args) {
        Sorting05 T = new Sorting05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution(n, arr));
    }
}