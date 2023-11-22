package org.sparta.programmers.lv3;

import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Cards {
    public static void main(String[] args) {
        class Solution {
            public String solution(String[] cards1, String[] cards2, String[] goal) {
                String answer = "Yes";
                int cnt1=0;
                int cnt2=0;
                for(String s : goal){
                    if(cnt1<cards1.length && Objects.equals(cards1[cnt1], s)){
                        cnt1++;
                    }
                    else if(cnt2<cards2.length && Objects.equals(cards2[cnt2],s)){
                        cnt2++;
                    }
                    else{
                        answer="No";
                    }
                }
                return answer;
            }
        }
    }
}
