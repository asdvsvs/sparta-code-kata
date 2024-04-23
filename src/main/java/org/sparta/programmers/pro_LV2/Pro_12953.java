package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Pro_12953 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] arr) {
                int answer = 1;

                while (true) {
                    int cnt = 0;
                    for (int i : arr) {
                        if (answer % i != 0) {
                            answer++;
                            break;
                        } else {
                            cnt++;
                        }
                    }
                    if (cnt == arr.length) {
                        break;
                    }
                }

                return answer;
            }
        }

    }
}
