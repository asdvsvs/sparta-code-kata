package org.sparta.baekjoon.bylevel.lv3;

import java.io.*;

public class BaekJoon_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            sum += Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
        }

        if (x == sum) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }
        bw.flush();
        bw.close();
    }
}
