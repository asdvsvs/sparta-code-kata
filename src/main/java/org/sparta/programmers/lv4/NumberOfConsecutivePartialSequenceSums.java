package org.sparta.programmers.lv4;

import java.util.HashSet;
import java.util.Set;

public class NumberOfConsecutivePartialSequenceSums {

    public static void main(String[] args) {
        class Solution {

            public int solution(int[] elements) {
                int answer = 0;

                Set<Integer> result = new HashSet<>();
                int[] arr = new int[elements.length];

                for (int j = 0; j < elements.length; j++) {
                    for (int i = 0; i < elements.length; i++) {
                        int t = i + j;
                        if (t >= elements.length) {
                            t = t % elements.length;
                        }
                        if (i == 0) {
                            arr[i] = elements[t];
                        } else {
                            arr[i] = arr[i - 1] + elements[t];
                        }
                    }
                    for (int i : arr) {
                        result.add(i);
                    }
                }
                answer = result.size();
                return answer;
            }
        }
    }
}
