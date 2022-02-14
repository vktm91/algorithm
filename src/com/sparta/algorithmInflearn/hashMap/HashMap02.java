package com.sparta.algorithmInflearn.hashMap;

import java.util.HashMap;
import java.util.Scanner;

// 아나그램
public class HashMap02 {
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {   // s1으로 +1 카운팅하면서 해쉬맵 만들고
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {   // s2로 같은 문자 -1 한다, 밸류가 모두 0이되면 일치하는 것
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";   // 키가 없거나 이미 0이면 불일치, 두 문자열의 길이가 같다는 점 유의
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap02 T = new HashMap02();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
