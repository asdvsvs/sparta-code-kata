package org.sparta.programmers.lv5;

public class FindDecimalsKBinary {

    public static void main(String[] args) {
        class Solution {

            public int solution(int n, int k) {
                int answer = 0;

                String s = "";
                while (true) {
                    s = n % k + s;
                    if (n < k) {
                        break;
                    }
                    n = n / k;
                    if (n == 0) {
                        s = 1 + s;
                        break;
                    }
                }
                String[] numStr = s.split("0");
                loop:
                for (String str : numStr) {
                    if (str.isEmpty() || str.equals("1")) {
                        continue;
                    }
                    long num = Long.parseLong(str);
                    for (long i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            continue loop;
                        }
                    }
                    answer++;
                }

                return answer;
            }
        }
    }

}
