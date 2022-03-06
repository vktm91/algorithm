package com.sparta.algorithmInflearn.hashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// k번째 큰 수
public class HashMap05 {
    public int solution(int[] arr, int n, int k) {
        int answer = -1;   // k번째 수가 존재하지 않으면 -1리턴 하라는 문제 조건
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());   // 기본적으로 오름차순인데 내림차순으로 하기위해 reverseOrder() 사용
        for (int i = 0; i < n; i++) {   // 3중 for문으로 n개에서 3개 뽑아내는 조합
            for (int j = i + 1; j < n; j++) {   // 중복이면 안되니까 i+1, 뒷편부터 돌아야함, i뽑혔는데 또 j가 i뽑고있으면 안되니까
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k) return x;
//            System.out.println(cnt+"-"+x);
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap05 T = new HashMap05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(arr, n, k));
    }
}

// set은 중복제거를 하는 자료구조, set중 TreeSet은 내림 혹은 오름차순 자료구조
// .remove(143): 143을 지움
// .size(): 원소의 개수를 리턴
// .first(): 제일 앞 자료 리턴
// .last(): 마지막 자료 리턴