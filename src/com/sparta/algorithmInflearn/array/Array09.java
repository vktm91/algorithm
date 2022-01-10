package com.sparta.algorithmInflearn.array;

import java.util.Scanner;

// 격자판 최대합
public class Array09 {
    public int solution(int n, int[][] arr){
        int answer=Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++){   // i고정
            sum1=sum2=0;   // 합계 초기화
            for(int j=0; j<n; j++){   // j가 돈다
                sum1+=arr[i][j];   // [i]행[j]열, i행 고정, sum1=i행의 합
                sum2+=arr[j][i];   // [j]행[i]열, i열 고정, sum2=i열의 합
           }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];   // 행과 열이 같은 대각선의 합
            sum2+=arr[i][n-i-1];   // 반대 대각선의 합
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args){
        Array09 T = new Array09();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; i<n; i++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
