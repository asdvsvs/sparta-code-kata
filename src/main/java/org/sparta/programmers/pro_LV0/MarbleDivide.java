package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120840
public class MarbleDivide {
    public static void main(String[] args) {
        class Solution {
            static int answer = 0;

            public int solution(int balls, int share) {

                f(balls, share, 0, new boolean[balls], 0);

                return answer;
            }


            public void f(int balls, int share, int depth, boolean[] bool, int temp) {
                if (depth == share) {
                    answer++;
                    return;
                }

                for (int i = temp; i < balls; i++) {
                    if (!bool[i]) {
                        bool[i] = true;
                        f(balls, share, depth + 1, bool, i);
                        bool[i] = false;
                    }
                }
            }
        }
    }
}
