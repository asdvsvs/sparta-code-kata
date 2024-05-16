package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();

        int temp = Integer.parseInt(str[0]);
        int idx = 0;
        str[0] = "0";
        list.add(1);
        for (int i = 0; i < n - 1; i++) {
            int t = Math.abs(temp);
            for (int j = 0; j < t; j++) {
                if (temp > 0) {
                    idx++;
                    if (idx > n - 1) {
                        idx = 0;
                    }
                } else {
                    idx--;
                    if (idx < 0) {
                        idx = n - 1;
                    }
                }
                if (str[idx].equals("0")) {
                    t++;
                }
            }
            temp = Integer.parseInt(str[idx]);
            list.add(idx + 1);
            str[idx] = "0";
        }

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                bw.write(list.get(i) + " ");
            } else {
                bw.write(list.get(i) + "");
            }
        }
        bw.flush();
        bw.close();
    }
}
