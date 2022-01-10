package com.sparta.algorithmInflearn.array;

import java.util.Scanner;

// 보이는 학생
public class Array02 {
    public int solution(int n, int[] arr) {
        int answer = 1, max=arr[0];   // 첫번쨰사람 무조건 보이니까 1
        for(int i=1; i<n; i++){   // 두번째사람부터 비교하면 되니까 i=1
            if(arr[i]>max){
                answer++;
                max=arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array02 T = new Array02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];   //n크기의 동적배열 생성
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}