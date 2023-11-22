package org.sparta.programmers.lv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fruiterer {
    public static void main(String[] args) {
        class Solution {
            public int solution(int k, int m, int[] score) {
                int answer = 0;
                int cnt = 0;
                while (k > 0) {
                    for (int i : score) {
                        if (i == k) {
                            cnt++;
                            if (cnt == m) {
                                answer += k * m;
                                cnt = 0;
                            }
                        }
                    }
                    k--;
                }

            /** 정렬을 사용한 방법
                 Arrays.sort(score);
                 for (int i = score.length; 0 < i; i-=m) {
                 answer+=score[i-m]*m;
                 }
            */

            /** List에 담아 하나씩 삭제하는 방법 (시간 초과)
                int cnt=0;
                List<Integer> list = new ArrayList<>();
                for (int i : score){
                    list.add(i);
                }
                while(list.size()>0){
                    if(list.contains(k)){
                        list.remove(list.lastIndexOf(k));
                        cnt++;
                        if(cnt==m){
                            answer+=k*m;
                            cnt=0;
                        }
                    }else{
                        k--;
                    }
                }
             */
                return answer;
            }
        }
    }
}
