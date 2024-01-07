package org.sparta.baekjoon.bylevel.lv20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon_1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        loop:
        for (int i = 0; i < n; i++) {
            int r = list.get(list.size() - 1) * list.get(i);
            for (int j = 0; j < n; j++) {
                if (r % list.get(j) != 0) {
                    break;
                }
                if (j == n - 1) {
                    bw.write(r + "");
                    break loop;
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
