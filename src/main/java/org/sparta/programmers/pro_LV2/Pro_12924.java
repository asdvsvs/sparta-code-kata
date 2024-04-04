package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12924
public class Pro_12924 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int num = 1;

                while (num <= n) {
                    int sum = 0;
                    for (int i = num; i <= n; i++) {
                        sum += i;
                        if (sum == n) {
                            answer++;
                            break;
                        } else if (sum > n) {
                            break;
                        }
                    }
                    num++;
                }

                return answer;
            }
        }
    }
}
