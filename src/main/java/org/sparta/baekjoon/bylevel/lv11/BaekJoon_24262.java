package org.sparta.baekjoon.bylevel.lv11;

import java.io.*;

public class BaekJoon_24262 {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        MenOfPassion(new int[n], n);
        bw.write(cnt + "\n");
        int order = 0;
        if (cnt / n == 1) {
            order = 0;
        }
        bw.write(order + "");
        bw.flush();
        bw.close();
    }

    static int MenOfPassion(int[] A, int n) {
        int i = n / 2;
        cnt++;
        return A[i];
    }
}
