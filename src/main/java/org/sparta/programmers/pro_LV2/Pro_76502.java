package org.sparta.programmers.pro_LV2;

//https://school.programmers.co.kr/learn/courses/30/lessons/76502

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pro_76502 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String s) {
                int answer = 0;


                for (int k = 0; k < s.length(); k++) {
                    Queue<Character> q = new LinkedList<>();
                    for (int i = 0; i < s.length(); i++) {
                        q.add(s.charAt(i));
                    }
                    for (int i = 0; i < k + 1; i++) {
                        q.add(q.poll());
                    }
                    Stack<Character> stack = new Stack<>();

                    for (int i = 0; i < s.length(); i++) {
                        if (stack.isEmpty()) {
                            stack.push(q.poll());
                        } else {
                            if (q.peek() == ']' && stack.peek() == '[') {
                                q.poll();
                                stack.pop();
                            } else if (q.peek() == ')' && stack.peek() == '(') {
                                q.poll();
                                stack.pop();
                            } else if (q.peek() == '}' && stack.peek() == '{') {
                                q.poll();
                                stack.pop();
                            } else {
                                stack.push(q.poll());
                            }
                        }
                    }
                    if (stack.isEmpty()) {
                        answer++;
                    }
                }

                return answer;
            }
        }
    }
}
