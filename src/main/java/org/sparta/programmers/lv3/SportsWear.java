package org.sparta.programmers.lv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SportsWear {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n, int[] lost, int[] reserve) {
                int answer = n-lost.length;
                int cnt=0;
                List<Integer> lostList = new ArrayList<>();
                List<Integer> reserveList = new ArrayList<>();
                for(int i:lost) lostList.add(i);
                for(int i:reserve) reserveList.add(i);
                for(int i=0;i<lost.length;i++){
                    if(reserveList.contains(lostList.get(cnt))){
                        reserveList.remove(lostList.get(cnt));
                        lostList.remove(lostList.get(cnt));
                        answer++;
                    }else cnt++;
                }
                Collections.sort(lostList);
                Collections.sort(reserveList);

                if(!lostList.isEmpty()){
                    for(int i : lostList){
                        if(reserveList.isEmpty())break;
                        if(reserveList.contains(i-1)){
                            answer++;
                            reserveList.remove(reserveList.indexOf(i-1));
                        }
                        else if(reserveList.contains(i+1)){
                            answer++;
                            reserveList.remove(reserveList.indexOf(i+1));
                        }
                    }
                }


                return answer;
            }
        }
    }
}
