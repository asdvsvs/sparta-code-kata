package org.sparta.programmers.lv3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumAdd {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] numbers) {
                int cnt = 0;
                Set<Integer> set = new HashSet<>();
                for(int i=0;i<numbers.length;i++){
                    for(int j=i+1;j<numbers.length;j++){
                        set.add(numbers[i]+numbers[j]);
                    }
                }
                int[] answer = new int[set.size()];
                for (int num: set){
                    answer[cnt] = num;
                    cnt++;
                }
                Arrays.sort(answer);

                return answer;
            }
        }
    }
}
