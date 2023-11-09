package org.sparta.programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TernaryReversal {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int base3 = 3;
                List<Integer> ternary = new ArrayList<>();
                while (base3 <= n) {
                    base3 *= 3;
                }
                while (base3>=3) {
                    base3 /= 3;
                    ternary.add(n / base3);
                    n %= base3;
                }
                for(int i :ternary){
                    answer+=base3*i;
                    base3*=3;
                }
                System.out.println(answer);
                return answer;
            }
        }
        Solution solution = new Solution();
        solution.solution(3);
    }
}
