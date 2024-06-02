package org.sparta.baekjoon.codeplus.num9375;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaekJoon_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(String.valueOf(i));
        }
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("add")) {
                set.add(s[1]);
            } else if (s[0].equals("remove")) {
                set.remove(s[1]);
            } else if (s[0].equals("check")) {
                if (set.contains(s[1])) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (s[0].equals("toggle")) {
                if (set.contains(s[1])) {
                    set.remove(s[1]);
                } else {
                    set.add(s[1]);
                }
            } else if (s[0].equals("all")) {
                set.addAll(list);
            } else if (s[0].equals("empty")) {
                set.clear();
            }
        }
        bw.flush();
        bw.close();
    }
}
