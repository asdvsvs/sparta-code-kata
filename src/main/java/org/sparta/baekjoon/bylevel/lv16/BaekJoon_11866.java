package org.sparta.baekjoon.bylevel.lv16;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        int cnt = 0;
        bw.write("<");
        while (true) {
            cnt++;
            if (q.size() == 1) {
                bw.write(q.poll() + ">");
                break;
            }
            if (cnt % k == 0) {
                bw.write(q.poll() + ", ");
            } else {
                q.add(q.poll());
            }
        }
        bw.flush();
        bw.close();
    }
}
