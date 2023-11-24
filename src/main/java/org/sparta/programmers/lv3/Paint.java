package org.sparta.programmers.lv3;

public class Paint {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int[] pibonaci = new int [n+1];
                pibonaci[0] =0;
                pibonaci[1] =1;
                for(int i=2; i<=n;i++){
                    pibonaci[i]= (pibonaci[i-1]+pibonaci[i-2])%1234567;
                }
                answer=pibonaci[n];

                return answer;
            }
        }
    }
}
