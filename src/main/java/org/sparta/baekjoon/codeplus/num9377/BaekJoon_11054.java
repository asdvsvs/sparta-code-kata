package org.sparta.baekjoon.codeplus.num9377;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] upDp = new int[n + 1];
        int[] downDp = new int[n + 1];
        upDp[1] = 1;
        downDp[n] = 1;


        for (int i = 2; i <= n; i++) {
            int upMax = 0;
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[i]) {
                    upMax = Math.max(upMax, upDp[j]);
                }
            }
            upDp[i] = upMax + 1;
        }

        for (int i = n - 1; i >= 1; i--) {
            int downMax = 0;
            for (int j = n; j > i; j--) {
                if (arr[i] > arr[j]) {
                    downMax = Math.max(downMax, downDp[j]);
                }
            }
            downDp[i] = downMax + 1;
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, upDp[i] + downDp[i] - 1);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
