package com.sparta.algorithmInflearn.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap01 {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);    // map.getOrDefault 매우중요!
            // get은 키(x)의 밸류값(처음이라 없다면 0)을 리턴한거에 +1해서 map에 put
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            // System.out.println(x+" "+map.get(x));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        HashMap01 T = new HashMap01();
        Scanner kb = new Scanner(System.in);
        ;
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }

    // map.containsKey('F'): 'F'라는 키가 존재하는지 true false로 반환
    // map.size(): 키의 갯수
    // map.remove('A'): 키 'A'의  (key, value)를 삭제한 후 그 value 값을 리턴
}
