package org.sparta.programmers.pro_LV1;

import java.util.HashSet;
import java.util.Set;

public class Ponketmon {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] nums) {
                int answer = 0;

                Set<Integer> set = new HashSet<>();

                for (int i : nums) {
                    set.add(i);
                }
                if (set.size() > nums.length / 2) {
                    answer = nums.length / 2;
                } else {
                    answer = set.size();
                }
                return answer;
            }
        }
    }
}
