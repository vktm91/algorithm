package com.sparta.algorithmInflearn.Array;

import java.util.Scanner;

// 봉우리
public class Array10 {
    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
    public int solution(int n, int[][] arr){
        int answer=0;
        for(int i=0; i<n; i++){   // 행
            for(int j=0; j<n; j++){   // 열
                boolean flag=true;
                for(int k=0; k<4; k++){   // 상,하,좌,우
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){   // IndexOutOfBounds 오류 방지 조건 (순서 앞에 와야함 주의!)
                        flag=false;
                        break;   // 4방향중 하나라도 큰게 있으면 나머지 방향 더 볼 필요없으니까
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Array10 T = new Array10();
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }


}
