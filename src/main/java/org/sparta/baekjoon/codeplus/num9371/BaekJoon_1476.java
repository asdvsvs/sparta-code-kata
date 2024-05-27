package org.sparta.baekjoon.codeplus.num9371;

import java.io.*;

public class BaekJoon_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int cnt = 0;
        int[] temp = new int[3];
        boolean bool = false;
        while (true) {
            cnt++;
            for (int i = 0; i < temp.length; i++) {
                temp[i]++;
            }
            if (temp[0] > 15) {
                temp[0] %= 15;
            }
            if (temp[1] > 28) {
                temp[1] %= 28;
            }
            if (temp[2] > 19) {
                temp[2] %= 19;
            }
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] != arr[i]) {
                    break;
                }
                if (i == temp.length - 1) {
                    bool = true;
                }
            }

            if (bool) {
                break;
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
