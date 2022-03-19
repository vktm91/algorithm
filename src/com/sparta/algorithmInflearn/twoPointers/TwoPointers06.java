package com.sparta.algorithmInflearn.twoPointers;

import java.util.Scanner;

// 연속된 자연수의 합(수학)
public class TwoPointers06 {
    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPointers05 T = new TwoPointers05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
