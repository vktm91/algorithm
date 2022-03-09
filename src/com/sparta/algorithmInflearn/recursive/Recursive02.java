package com.sparta.algorithmInflearn.recursive;

// 이진수 출력(재귀)
public class Recursive02 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2 + " ");   // 역순출력위해 호출 밑에
        }
    }

    public static void main(String[] args) {
        Recursive02 T = new Recursive02();
        T.DFS(11);
    }
}
