package org.sparta.programmers.pro_LV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpirationPersonalInformation {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String today, String[] terms, String[] privacies) {
                int idx = 1;
                List<Integer> list = new ArrayList<>();

                //map에 담는 곳
                Map<String, Integer> map = new HashMap<>();
                for (String s : terms) {
                    String[] str = s.split(" ");
                    map.put(str[0], Integer.parseInt(str[1]));
                }

                //오늘 날짜에서 . 제거
                today = today.replace(".", "");


                //로직
                for (String s : privacies) {
                    String[] str = s.split(" ");
                    // String[] date = str[0].split(".");
                    String year = str[0].substring(0, 4);
                    String month = str[0].substring(5, 7);
                    String day = str[0].substring(8, 10);
                    int temp = Integer.parseInt(month) + map.get(str[1]);

                    if (temp <= 12) {
                        month = String.valueOf(temp);
                    } else {
                        month = String.valueOf(temp % 12);
                        year = String.valueOf(Integer.parseInt(year) + (temp / 12));
                    }

                    if (day.equals("01")) {
                        day = "28";
                        month = String.valueOf(Integer.parseInt(month) - 1);
                    } else {
                        day = String.valueOf(Integer.parseInt(day) - 1);
                        if (day.length() == 1) {
                            day = "0" + day;
                        }
                    }
                    if (month.equals("0") || month.equals("-1")) {
                        year = String.valueOf(Integer.parseInt(year) - 1);
                        month = "12";
                    }
                    if (month.length() == 1) {
                        month = "0" + month;
                    }

                    if (Integer.parseInt(today) > Integer.parseInt(year + month + day)) {
                        // System.out.println(today+ ", " + year + month + day);
                        list.add(idx);
                    }
                    idx++;
                }


                int[] answer = new int[list.size()];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = list.get(i);
                }

                return answer;
            }
        }
    }
}
