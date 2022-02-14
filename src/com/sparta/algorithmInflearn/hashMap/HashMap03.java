package com.sparta.algorithmInflearn.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 매출액의 종류 (해쉬맵+슬라이딩윈도우)
public class HashMap03 {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++){    // k일 간이니까 k-1 전까지 일단 넣어놓는다
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;   // 슬라이딩 윈도우
        for(int rt=k-1; rt<n; rt++){   // k-1 부터 rt 시작
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());   // 매출액의 종류 = 키의 종류
            HM.put(arr[lt], HM.get(arr[lt])-1);   // 윈도우 밀기전 lt값 감소시키기
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);   // 밸류값이 0이된 키는 세어지면 안되니 삭제
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap03 T = new HashMap03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }
}
