package org.sparta.programmers.pro_LV1;

import java.util.*;

public class Pro_250121 {
    public static void main(String[] args) {
        class Solution {
            public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
                String[] extArr = {"code", "date", "maximum", "remain"};
                int extN = 0;
                int sortN = 0;

                for (int i = 0; i < extArr.length; i++) {
                    if (extArr[i].equals(ext)) {
                        extN = i;
                    }
                    if (extArr[i].equals(sort_by)) {
                        sortN = i;
                    }
                }

                List<Integer> idxList = new ArrayList<>();
                for (int i = 0; i < data.length; i++) {
                    if (data[i][extN] < val_ext) {
                        idxList.add(i);
                    }
                }

                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < idxList.size(); i++) {
                    map.put(data[idxList.get(i)][sortN], idxList.get(i));
                }
                List<Integer> keyList = new ArrayList<>(map.keySet());
                Collections.sort(keyList);


                int[][] answer = new int[idxList.size()][data[0].length];
                for (int i = 0; i < keyList.size(); i++) {
                    int n = map.get(keyList.get(i));
                    for (int j = 0; j < data[0].length; j++) {
                        answer[i][j] = data[n][j];
                    }
                }


                return answer;
            }
        }
    }
}
