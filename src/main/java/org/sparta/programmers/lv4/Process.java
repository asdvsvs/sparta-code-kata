package org.sparta.programmers.lv4;

import java.util.LinkedList;
import java.util.Queue;

public class Process {

    public static void main(String[] args) {
        class Solution {

            public int solution(int[] priorities, int location) {
                int answer = 0;
                int max = 0;

                Queue<Integer> q = new LinkedList<>();

                for (int i : priorities) {
                    q.add(i);
                }

                loop:
                while (true) {
                    max = 0;
                    for (int i : q) {
                        max = Math.max(max, i);
                    }
                    for (int i = 0; i < priorities.length; i++) {
                        if (q.peek() == max) {
                            q.poll();
                            answer++;
                            if (location == 0) {
                                break loop;
                            }
                            location--;
                            break;
                        } else {
                            q.add(q.poll());
                            location--;
                            if (location < 0) {
                                location = q.size() - 1;
                            }
                        }
                    }
                }

                return answer;
            }
        }
    }
}
