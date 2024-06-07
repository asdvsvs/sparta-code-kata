package org.sparta.baekjoon.codeplus.num9376;
//https://www.acmicpc.net/board/view/114371

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, size[j]);
                }
            }
            size[i] = max + 1;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, size[i]);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
