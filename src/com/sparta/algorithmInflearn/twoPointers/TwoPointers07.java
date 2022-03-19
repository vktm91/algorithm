package com.sparta.algorithmInflearn.twoPointers;

import java.util.Scanner;

// 최대 길이 연속부분수열
public class TwoPointers07 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;   // cnt=1로 바꾼횟수
        for (int rt = 0; rt < n; rt++) {   // rt가 돌면서 0을 가리킬때 1로 바꾸는 것과 같은 가정
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {   // 바꾼횟수가 k를 초과하게 되면
                if (arr[lt] == 0) cnt--;   // lt가 쫓아가면서 바뀐 1을 찾아 0으로 다시 변경하는 것과 같은 가정
                lt++;   // 바꾸고 그 다음으로 넘어가야 k 미만으로 조정됨
            }
            answer = Math.max(answer, rt - lt + 1);   // rt-lt-+1=수열의 길이
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPointers07 T = new TwoPointers07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
