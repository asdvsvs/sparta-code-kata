package org.sparta.programmers.lv3;

import java.util.ArrayList;
import java.util.List;

public class NearestAlphabet {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String s) {
                int[] answer = new int[s.length()];
                int cnt=0;
                List<Character> list = new ArrayList<>();
                char[] c = s.toCharArray();
                for (int i=0; i < c.length; i++) {
                    if (list.contains(c[i])) {
                        answer[cnt]=i-list.lastIndexOf(c[i]);
                        cnt++;
                    }
                    else {
                        answer[cnt]=-1;
                        cnt++;
                    }
                    list.add(c[i]);
                }
                return answer;
            }
        }
    }
}
