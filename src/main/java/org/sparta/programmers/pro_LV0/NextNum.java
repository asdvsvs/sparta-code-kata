package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120924
public class NextNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] common) {
                int answer = 0;

                for (int i : common) {
                    if (i == 0) {
                        return answer = common[common.length - 1] + common[common.length - 1] - common[common.length - 2];
                    }
                }
                if (common[common.length - 1] == common[common.length - 2] * (common[common.length - 2] / common[common.length - 3])) {
                    answer = common[common.length - 1] * common[common.length - 2] / common[common.length - 3];
                } else {
                    answer = common[common.length - 1] + common[common.length - 1] - common[common.length - 2];
                }


                return answer;
            }
        }
    }
}
