package org.sparta.programmers.lv2;

public class GcdLcm_39 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int n, int m) {
                int[] answer = new int[2];
                int gcd=0;
                int lcm=0;
                for(int i=1; i<=n;i++){
                    if(n%i==0 && m%i==0)gcd=i;
                }
                loop:
                for (int i=1;i<=n*m;i++){
                    for (int j=1;j<=n*m;j++){
                        if(n*i < m*j) break;
                        if(n*i == m*j){
                            lcm=m*j;
                            break loop;
                        }
                    }
                }
                answer[0]=gcd;
                answer[1]=lcm;
                return answer;
            }
        }
    }
}
