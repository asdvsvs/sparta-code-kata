package org.sparta.programmers.pro_LV1;

public class CreateDecimal {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] nums) {
                int answer = 0;

                for (int i = 0; i < nums.length - 2; i++) {
                    for (int j = i + 1; j < nums.length - 1; j++) {
                        loop:
                        for (int k = j + 1; k < nums.length; k++) {
                            int sum = nums[i] + nums[j] + nums[k];
                            for (int l = 2; l * l <= sum; l++) {
                                if (sum % l == 0) {
                                    continue loop;
                                }
                            }

                            answer++;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
