package org.sparta.programmers.pro_LV0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120808#
public class Pro_120808 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int numer1, int denom1, int numer2, int denom2) {
                int[] answer = new int[2];

                int numer = numer1 * denom2 + numer2 * denom1;
                int denom = denom1 * denom2;
                for (int i = 2; i <= numer; i++) {
                    if (numer % i == 0 && denom % i == 0) {
                        numer /= i;
                        denom /= i;
                        i--;
                    }
                }
//                for (int i = numer; i >= 2; i--) {
//                    if (numer % i == 0 && denom % i == 0) {
//                        numer /= i;
//                        denom /= i;
//                        break;
//                    }
//                }
                answer[0] = numer;
                answer[1] = denom;
                return answer;
            }
        }


    }
}
