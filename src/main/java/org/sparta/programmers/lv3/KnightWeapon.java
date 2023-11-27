package org.sparta.programmers.lv3;

public class KnightWeapon {
    public static void main(String[] args) {
        class Solution {
            public int solution(int number, int limit, int power) {
                int answer = 0;
                int root =1;
                int cnt;
                for(int i=1; i<=number; i++){
                    cnt=0;
                    while(i>root*root)root++;
                    for(int j=1; j<root;j++){
                        if(i%j==0) cnt+=2;
                    }
                    if(i==root*root) cnt++;
                    if(cnt>limit) answer+=power;
                    else answer+=cnt;
                }
                return answer;
            }
        }
    }
}
