package org.sparta.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int temp =0;
        List<Integer> ingreList = new ArrayList<>();
        for(int i:ingredient) ingreList.add(i);

        while(true){
            for(int i=0;i<ingreList.size()-3;i++){
                if(ingreList.get(i)==1
                        && ingreList.get(i+1)==2
                        && ingreList.get(i+2)==3
                        && ingreList.get(i+3)==1
                ){
                    answer++;
                    for(int j=0;j<4;j++)ingreList.remove(i);
                    i-=3;
                    if(i<0)i=0;
                }
            }
            if(temp==answer)break;
            else temp=answer;
        }

        return answer;
    }
}