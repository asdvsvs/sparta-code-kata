package org.sparta.baekjoon.bylevel.lv14;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            set.add(temp);
            for (int j = i + 1; j < s.length(); j++) {
                temp += s.charAt(j);
                set.add(temp);
            }
        }
        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}
