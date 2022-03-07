package com.sparta.algorithmInflearn.recursive;

// 재귀함수(스택프레임)
public class Recursive01 {
    public void DFS(int n) {
        if (n == 0) return;    // return은 값을 반환하는 역할도 하지만 void형일경우 함수를 종료하는 역할도 한다

        else {
            //System.out.print(n + " ");   // 호출 위에 있으면 3 2 1 역순으로 리턴
            DFS(n - 1);   // 호출
            System.out.print(n + " ");       // 재귀함수는 스택 자료구조를 사용 // 스택에 매개변수, 지역변수, 복귀주소를 가진 스택프레임이 생긴다, 스택은 제일 상단부터 작동하는 원리
        }
    }

    public static void main(String[] args) {
        Recursive01 T = new Recursive01();
        T.DFS(3);
    }
}


// 재귀함수는 스택프레임이 여러개 생성되기 때문에 for문보다 오래걸린다