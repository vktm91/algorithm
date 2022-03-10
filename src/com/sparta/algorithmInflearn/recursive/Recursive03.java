package com.sparta.algorithmInflearn.recursive;

// 팩토리얼
public class Recursive03 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }

    public static void main(String[] args) {
        Recursive03 T = new Recursive03();
        System.out.println(T.DFS(5));
    }
}
