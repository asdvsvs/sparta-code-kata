package org.sparta.programmers.category.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    public static void main(String[] args) {
        solution(new String[]{"119", "97674223", "1195524421"});
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<Integer, List<String>> phoneMap = new HashMap<>();
        for (String s : phone_book) {
            if (phoneMap.get(s.length())==null) {
                phoneMap.put(s.length(), new ArrayList<>());
            }
            phoneMap.get(s.length()).add(s);
        }
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            if(phoneMap.get(i)!=null)
                str.addAll(phoneMap.get(i));
        }
        Set<String> phoneSet = new HashSet<>();
        for (String num : str) {
            for (int i = 1; i <= num.length(); i++) {
                if (phoneSet.contains(num.substring(0, i))) {
                    return false;
                }
            }
            phoneSet.add(num);
        }

        return answer;
    }


}
