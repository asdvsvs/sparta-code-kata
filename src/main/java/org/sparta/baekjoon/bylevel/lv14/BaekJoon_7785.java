package org.sparta.baekjoon.bylevel.lv14;

import java.io.*;
import java.util.*;

public class BaekJoon_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (s[1].equals("enter")) {
                set.add(s[0]);
            } else if (s[1].equals("leave")) {
                set.remove(s[0]);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        Collections.reverse(list);
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
