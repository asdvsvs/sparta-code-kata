package org.sparta.programmers.lv4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class RotateParentheses {

    public static void main(String[] args) {
        class Solution {

            public int solution(String s) {
                int answer = 0;
                if (s.length() == 1) {
                    return 0;
                }
                char[] c = s.toCharArray();
                Queue<String> q = new LinkedList<>();
                Stack<String> stack = new Stack<>();
                Map<String, String> map = new HashMap<>();
                map.put(")", "(");
                map.put("]", "[");
                map.put("}", "{");

                for (char value : c) {
                    q.add(String.valueOf(value));
                }

                for (int i = 0; i < c.length; i++) {
                    stack.clear();
                    q.add(q.poll());
                    Queue<String> temp = new LinkedList<>(q);

                    for (int j = 0; j < c.length; j++) {
                        if (temp.peek() != null) {
                            stack.add(temp.poll());
                        }
                        if (stack.size() == 1 && map.get(stack.peek()) != null) {
                            break;
                        }
                        if (temp.peek() == null) {
                            break;
                        }

                        if (map.get(temp.peek()) != null) {
                            while (true) {
                                if (!stack.isEmpty() && Objects.equals(stack.peek(),
                                    map.get(temp.peek()))) {
                                    stack.pop();
                                    temp.poll();
                                } else {
                                    break;
                                }
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
