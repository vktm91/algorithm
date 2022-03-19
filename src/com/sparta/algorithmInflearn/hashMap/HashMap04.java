package com.sparta.algorithmInflearn.hashMap;

import java.util.HashMap;
import java.util.Scanner;

// 모든 아나그램 찾기 (해쉬맵+슬라이딩윈도우:시간복잡도 O(n))
public class HashMap04 {
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
        int L = b.length() - 1;   // bm돌 윈도우 길이를 한개 덜 세팅헤놓고
        for (int i = 0; i < L; i++)
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);   // rt 증가시키면서 String a를 도는 구조
        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);   // rt 하나 증가시키고
            if (am.equals(bm)) answer++;   // 값비교후 answer에 저장
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);   // lt 땡기기
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));   // 밸류 0인경우 카운팅되지않도록 키까지 삭제
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap04 T = new HashMap04();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
