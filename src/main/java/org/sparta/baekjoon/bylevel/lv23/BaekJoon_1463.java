package org.sparta.baekjoon.bylevel.lv23;
//https://www.acmicpc.net/board/view/143301

import java.io.*;

public class BaekJoon_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                int remove2 = i;
                while (remove2 % 2 == 0) {
                    remove2 /= 2;
                }
                int remove3 = i;
                while (remove3 % 3 == 0) {
                    remove3 /= 3;
                }
                arr[i] = Math.min(arr[remove2] + arr[i / remove2], arr[remove3] + arr[i / remove3]);
            } else if (i % 2 == 0) {
                arr[i] = arr[i / 2] + 1;
            } else if (i % 3 == 0) {
                arr[i] = arr[i / 3] + 1;
            } else {
                arr[i] = arr[i - 1] + 1;
            }
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);

        }

        bw.write(arr[n] + "");
        bw.flush();
        bw.close();
    }
}
