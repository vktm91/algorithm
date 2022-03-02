package com.sparta.algorithmInflearn.sorting;

import java.util.*;

// 좌표 정렬
class Point implements Comparable<Point> {   // Comparable 인터페이스의 구현클래스임
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override   // compareTo 메서드를 재정의하여 사용
    public int compareTo(Point o) {
        // this가 앞, o가 뒤 순서가 되려면 음수값이 리턴되도록한다고 외운다!!
        if (this.x == o.x) return this.y - o.y;   // 이 메서드를 호출한 객체와 매개변수로 넘어온 대상객체 비교해서 같으면 y비교하여 오름차순으로 정렬, 내림 차순의 경우 o.y - this.y 가 된다
        else return this.x - o.x;   // 다르면 x기준 정렬

//        // 내림차순 예시
//        if (this.x == o.x) return o.y - this.y;
//        else return o.y - this.y;
    }
}

public class Sorting07 {
    public static void main(String[] args) {
        Sorting07 T = new Sorting07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));   // Point 객체를 생성해서 x y 값을 arr에 넣어준다
        }
        Collections.sort(arr);   // sort의 정렬 기준이 만들어놓은 compareTo가 됨
        for (Point o : arr) System.out.println(o.x + " " + o.y);
    }
}