package org.sparta.programmers.lv4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReportResult {

    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] id_list, String[] report, int k) {
                int[] answer = new int [id_list.length];
                Map<String,Set<String>> idMap = new HashMap<>();

                for(String s : report){
                    String[] name = s.split(" ");
                    if(idMap.get(name[1])==null) idMap.put(name[1],new HashSet<>());
                    idMap.get(name[1]).add(name[0]);
                }
                for(int i=0;i<id_list.length;i++){
                    if(idMap.get(id_list[i])!=null && idMap.get(id_list[i]).size()>=k){
                        for(int j=0;j<id_list.length;j++){
                            if(idMap.get(id_list[i]).contains(id_list[j])){
                                answer[j]++;
                            }
                        }
                    }
                }

                return answer;
            }
        }
    }
}
