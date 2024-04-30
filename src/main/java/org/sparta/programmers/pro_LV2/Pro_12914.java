package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12914
//https://school.programmers.co.kr/questions/72769
public class Pro_12914 {
    public static void main(String[] args) {
        class Solution {
            public long solution(int n) {
                long answer = 0;
                long[] arr = new long[n];
                arr[0] = 1;
                if (n > 1) {
                    arr[1] = 2;
                }

                for (int i = 2; i < n; i++) {
                    arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
                }
                answer = arr[n - 1];
                return answer;
            }
        }

        // 1 2 3 5 8 13

        // 1   1
        // 2    11 2
        // 3    111 12 21
        // 4   1111 112 121 211 22
        // 5   11111 1112 1121 1211 2111 122 212 221
        // 6   111111 11112 11121 11211 12111 21111 1122 1221 1212 2121 2211 2112 222
    }
}
