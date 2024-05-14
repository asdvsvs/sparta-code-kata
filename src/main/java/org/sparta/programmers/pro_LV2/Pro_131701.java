package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/131701

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Pro_131701 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] elements) {
                int answer = 0;

                Queue<Integer> q = new LinkedList<>();
                Set<Integer> set = new HashSet<>();
                for (int i : elements) {
                    q.add(i);
                }

                for (int i = 0; i < elements.length; i++) {
                    int sum = 0;
                    for (int j = 0; j < elements.length; j++) {
                        sum += q.peek();
                        q.add(q.poll());
                        set.add(sum);
                    }
                    q.add(q.poll());
                }

                answer = set.size();
                return answer;
            }
        }
    }
}
