package org.sparta.baekjoon.bylevel.lv11;

import java.io.*;

public class BaekJoon_24263 {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        MenOfPassion(new int[n], n);
        bw.write(cnt + "\n");
        bw.write(cnt / n + "");
        bw.flush();
        bw.close();
    }

    static int MenOfPassion(int[] A, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            cnt++;
        }
        return sum;
    }
}
