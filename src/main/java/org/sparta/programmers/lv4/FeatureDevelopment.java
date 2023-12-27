package org.sparta.programmers.lv4;

public class FeatureDevelopment {

    public static void main(String[] args) {
        class Solution {

            public int[] solution(int[] progresses, int[] speeds) {
                int[] answer = new int[progresses.length];
                int[] completeDay = new int[progresses.length];
                int dayCount = 0;
                int release = 0;
                for (int i = 0; i < progresses.length; i++) {
                    completeDay[i] = (100 - progresses[i]) / speeds[i];
                    if ((100 - progresses[i]) % speeds[i] > 0) {
                        completeDay[i]++;
                    }
                }
                for (int i = 0; i < completeDay.length; i++) {
                    if (completeDay[i] > dayCount) {
                        dayCount = completeDay[i];
                        release = i;
                    }
                    answer[release]++;
                }

                int count = 0;
                for (int i : answer) {
                    if (i > 0) {
                        count++;
                    }
                }
                int[] realAnswer = new int[count];
                int index = 0;
                for (int i : answer) {
                    if (i > 0) {
                        realAnswer[index] = i;
                        index++;
                    }
                }

                return realAnswer;
            }
        }
    }

}
