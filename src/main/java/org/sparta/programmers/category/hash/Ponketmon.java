package org.sparta.programmers.category.hash;

import java.util.HashSet;
import java.util.Set;

public class Ponketmon {

    public static void main(String[] args) {
        class Solution {
            public int solution(int[] nums) {
                int answer = 0;

                Set<Integer> numSet = new HashSet<>();
                for(int i : nums){
                    numSet.add(i);
                }
                if(numSet.size()>=nums.length/2) answer = nums.length/2;
                else answer = numSet.size();
                return answer;
            }
        }
    }

}
