package org.sparta.programmers.lv5;

import java.util.ArrayList;
import java.util.List;

public class DiffBit {

    public static void main(String[] args) {
        class Solution {

            public long[] solution(long[] numbers) {
                long[] answer = new long[numbers.length];
                int count = 0;

                List<Long> temp = new ArrayList<>();
                for (long l = 1L; l <= 1000000000000000L; l *= 2) {
                    temp.add(l);
                }

                for (long l : numbers) {
                    long t = l;
                    String s = "";
                    //와 이건 생각 어렵다
                    if (t % 2 == 0) {
                        answer[count] = t + 1;
                        count++;
                        continue;
                    }
                    while (true) {
                        if (l == 1L) {
                            s = l + s;
                            break;
                        }
                        s = l % 2 + s;
                        l /= 2;
                    }
                    int a = s.lastIndexOf('0');
                    int squared;
                    if (a != -1) {
                        squared = s.length() - a;
                        answer[count] = t + temp.get(squared - 1) - temp.get(squared - 2);
                    } else {
                        answer[count] = t + temp.get(s.length()) - temp.get(s.length() - 1);
                    }
                    count++;
                }

                return answer;
            }
        }
    }

}
