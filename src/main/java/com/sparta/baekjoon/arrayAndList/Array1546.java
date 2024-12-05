package com.sparta.baekjoon.arrayAndList;

import java.util.Scanner;

// Baekjoon No.11720
public class Array1546 {
    public static void main(String[] args) {
        firstTry();
//        secondTry();
    }

    private static void firstTry() {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();   // 과목수
        kb.nextLine(); // <수정A> 버퍼에 남은 줄바꿈 제거
        String target = kb.nextLine();   // 현재 성적들
        String[] sTarget = target.split(" ");

        // 1. 최대값 고르기
        int hiestScore = 0;
        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(sTarget[i]);
            hiestScore = Math.max(hiestScore, score);
        }

        // 2. 과목별 새로운 점수 구하기
//        int sumNewScore = 0;   // <수정B> int로 받아서 소수점이 버려지는 점을 개선함
        double sumNewScore = 0;
        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(sTarget[i]);
//            int newScore = score / hiestScore * 100;   // <수정B> score를 double로 만들어 정수 나눗셈이 아닌 실수 나눗셈으로 계산한다.
            double newScore = (double) score / hiestScore * 100;
            sumNewScore += newScore;
        }
//        int newAverage = sumNewScore / n;   // <수정B>
        double newAverage = sumNewScore / n;

        System.out.println(newAverage);
    }

    //// 수정A
    // nextInt()는 입력 버퍼에서 정수 값만 읽어 줄바꿈 문자(\n)는 입력 버퍼에 그대로 남긴다.
    // nextInt() 뒤에 next(): 공백 기준으로 데이터를 읽기 때문에 문제가 없음.
    // nextInt() 뒤에 nextLine(): 줄바꿈 문자(\n)까지 읽어 빈 줄을 반환하므로 추가 처리가 필요.

    //// 수정B
    // 자바는 int형끼리의 계산인 경우 소수점 이하를 버린다
    // 피연산자 중 하나만 실수형으로 바꿔주면 소수점 이하가 유지된다

    private static void secondTry() {

    }
}
