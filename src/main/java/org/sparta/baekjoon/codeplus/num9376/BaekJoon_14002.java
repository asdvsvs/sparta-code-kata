package org.sparta.baekjoon.codeplus.num9376;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_14002 {
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

        String[] str = new String[n];
        Arrays.fill(str, "");
        for (int i = 0; i < n; i++) {
            int max = 0;
            String maxStr = "";
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (size[j] > max) {
                        max = size[j];
                        maxStr = str[j];
                    }
                }
            }
            str[i] = maxStr + " " + arr[i];
            size[i] = max + 1;
        }

        int max = 0;
        String maxStr = "";
        for (int i = 0; i < n; i++) {
            if (size[i] > max) {
                max = size[i];
                maxStr = str[i];
            }
        }

        bw.write(max + "\n");
        bw.write(maxStr.substring(1));
        bw.flush();
        bw.close();
    }
}
