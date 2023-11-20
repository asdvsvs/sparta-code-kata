package org.sparta.programmers.lv3;

public class ColaProblem {
    public static void main(String[] args) {
        class Solution {
            public int solution(int a, int b, int n) {
                int answer = 0;
                int temp = 0;
                while (n >= a) {
                    temp = n % a;
                    n = (n / a) * b;
                    answer += n;
                    n += temp;

//                    이렇게 풀면 간단한데..
//                    answer = n / a * b;
//                    n = n / a * b + n % a;
                }
                return answer;
            }
        }
    }
}
