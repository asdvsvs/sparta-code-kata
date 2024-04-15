package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Arrays;

public class Pro_42885 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] people, int limit) {
                int answer = 0;
                Arrays.sort(people);

                int left = 0;
                int right = people.length - 1;
                while (true) {
                    if (left > right) {
                        break;
                    }
                    if (people[left] + people[right] > limit) {
                        right--;
                        answer++;
                    } else {
                        left++;
                        right--;
                        answer++;
                    }
                }

                return answer;
            }
        }
    }
}
