package com.sparta.algorithmInflearn.recursive;

// 피보나치 재귀(메모이제이션)
public class Recursive04 {
    static int[] fibo;
    public int DFS(int n){
        if(fibo[n]>0) return fibo[n];  // 배열 값들은 처음에 0으로 초기화가 되어있는데 0보다 크다는 것은 저장 값을 가지고 있다는 것
        if(n==1) return fibo[n]=1;   // n은 항의 번호
        else if(n==2) return fibo[n]=1;
        else return fibo[n]= DFS(n-2)+DFS(n-1);   // 배열에 저장하고나서 배열값을 리턴
    }

    public static void main(String[] args) {
        Recursive04 T = new Recursive04();
        int n=7;
        fibo=new int[n+1];   // 0번 인덱스 필요없음, 예를들어 10이면 10번인덱스가 나오도록
        T.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
}

// 시간복잡도 줄이는 성능개선 방법
// 기본. for문으로 각 항들을 전부 호출
// 개선 1. 배열 추가, 배열에 중간 값들을 기록하여 n을 한번만 호출
// 개선 2. 0을 초과하는 배열값 확인하는 것 추가, 기존에 계산된 값들은 다시 계산하지 않고 바로 리턴