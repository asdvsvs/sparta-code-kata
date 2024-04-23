package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Pro_42842 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int brown, int yellow) {
                int[] answer = new int[2];
                int area = brown + yellow;

                for (int i = 3; i <= area; i++) {
                    if (area % i == 0 && yellow % (i - 2) == 0) {
                        if (area / i >= yellow / (i - 2) + 2) {
                            answer[1] = i;
                            break;
                        }
                    }
                }
                answer[0] = area / answer[1];
                return answer;
            }
        }
    }
}
