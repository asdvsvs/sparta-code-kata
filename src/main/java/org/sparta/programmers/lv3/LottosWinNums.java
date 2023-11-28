package org.sparta.programmers.lv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottosWinNums {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] lottos, int[] win_nums) {
                int[] answer = new int[2];
                List<Integer> winList = new ArrayList<>();
                for (int i : win_nums){
                    winList.add(i);
                }
                for (int i : lottos){
                    if(winList.contains(i)){
                        answer[1]++;
                    }
                    if(i==0){
                        answer[0]++;
                    }
                }

                answer[0]+=answer[1];
                if(answer[0]>1){
                    answer[0]=7-answer[0];
                }else{
                    answer[0]=6;
                }
                if(answer[1]>1){
                    answer[1]=7-answer[1];
                }else{
                    answer[1]=6;
                }

                return answer;
            }
        }

    }
}
