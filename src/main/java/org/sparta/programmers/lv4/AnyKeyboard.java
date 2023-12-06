package org.sparta.programmers.lv4;

import java.util.Arrays;

public class AnyKeyboard {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution()));

    }
    static class Solution {
        public int[] solution() {
            String[] keymap = {"ABACD", "BCEFD"};
            String[] targets = {"ABCD","AABB"};
            int[] answer = new int[targets.length];
            char[] cTarget;

            int cnt=0;

            loop:
            for (String target : targets) {
                cTarget = target.toCharArray();
                for (char c : cTarget) {
                    int index = -1;
                    for (String key : keymap) {
                        if(key.contains(String.valueOf(c)) && index == -1){
                            index = key.indexOf(c)+1;
                            continue ;
                        }
                        if (key.contains(String.valueOf(c)) &&  index > key.indexOf(c)+1){
                            index = key.indexOf(c)+1;
                        }
                    }
                    if (index==-1){
                        answer[cnt]=-1;
                        cnt++;
                        continue loop;
                    }else {
                        answer[cnt]+=index;
                    }
                }
                cnt++;
            }


            return answer;
        }
    }
}
