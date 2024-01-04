package org.sparta.programmers.lv5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFee {

    public static void main(String[] args) {
        class Solution {

            public int[] solution(int[] fees, String[] records) {
                Map<String, String> parkingTime = new HashMap<>();
                Map<String, Integer> parkedTime = new HashMap<>();
                Map<String, Boolean> parked = new HashMap<>();

                for (String r : records) {
                    String[] s = r.split(" ");
                    if (s[2].equals("IN")) {
                        parked.put(s[1], true);
                        parkingTime.put(s[1], s[0]);
                    } else if (s[2].equals("OUT")) {
                        parked.put(s[1], false);
                        int out = Integer.parseInt(s[0].replace(":", ""));
                        int in = Integer.parseInt(parkingTime.get(s[1]).replace(":", ""));
                        int outM = out / 100 * 60 + out % 100;
                        int inM = in / 100 * 60 + in % 100;
                        int parkingMinute = outM - inM;

                        if (parkedTime.get(s[1]) == null) {
                            parkedTime.put(s[1], parkingMinute);
                        } else {
                            int beforeMinute = parkedTime.get(s[1]);
                            parkedTime.put(s[1], beforeMinute + parkingMinute);
                        }
                    }
                }

                for (String s : parked.keySet()) {
                    if (parked.get(s)) {
                        int in = Integer.parseInt(parkingTime.get(s).replace(":", ""));
                        int inM = in / 100 * 60 + in % 100;
                        int outM = 23 * 60 + 59;
                        int parkingMinute = outM - inM;

                        if (parkedTime.get(s) == null) {
                            parkedTime.put(s, parkingMinute);
                        } else {
                            int beforeMinute = parkedTime.get(s);
                            parkedTime.put(s, beforeMinute + parkingMinute);
                        }
                    }
                }

                int[] answer = new int[parkedTime.keySet().size()];
                int count = 0;

                List<String> list = new ArrayList<>(parkedTime.keySet());
                Collections.sort(list);

                for (String s : list) {
                    int totalM = parkedTime.get(s);
                    if (totalM <= fees[0]) {
                        answer[count] = fees[1];
                    } else {
                        totalM -= fees[0];
                        int addFee = totalM % fees[2] == 0 ? totalM / fees[2] * fees[3]
                            : (totalM / fees[2] + 1) * fees[3];
                        answer[count] = fees[1] + addFee;
                    }
                    count++;
                }

                return answer;
            }
        }
    }

}
