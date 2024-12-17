package com.sparta.baekjoon.arrayAndList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1억번(=1초) 넘지않게 해야한다. // 10만(배열길이) * 10만(질의횟수)는 1억이 넘어간다
public class Array11659 {
    public static void main(String[] args) throws IOException {
        firstTry();
    }

    private static void firstTry() throws IOException {
        // 받는 데이터가 많을 때는 scanner 보다 빠른 buffer 를 사용한다.
        // 한줄에 많은 데이터가 들어올땐 int형으로 받기 힘들기 때문에 StringTokenizer를 사용한다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long[] a = new long[suNo];
        for (int i = 0; i < suNo; i++) {
            a[i] = Long.parseLong(stringTokenizer.nextToken());
        }

        for (int i = 0; i < quizNo; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            int sum = 0;
            for (int j = start; j < end; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }

    // 합배열 공식 S[i] = S[i-1] + A[i]
    // 구간 합 공식 S[i] = S[j] - S[i-1]
    private static void secondTry() throws IOException {
        // 받는 데이터가 많을 때는 scanner 보다 빠른 buffer 를 사용한다.
        // 한줄에 많은 데이터가 들어올땐 int형으로 받기 힘들기 때문에 StringTokenizer를 사용한다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long[] s = new long[suNo + 1];   // 0번째 index 안 쓰고 1번째 index부터 쓰려고 +1 함
        for(int i=1; i <= suNo; i++) {
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q=o; q<quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(s[j] - s[i-1]);
        }

    }
}
