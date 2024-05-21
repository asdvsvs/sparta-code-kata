package org.sparta.baekjoon.bylevel.lv23;

import java.io.*;

public class BaekJoon_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        int[][] cost = new int[n][3];
        for (int i = 0; i < cost.length; i++) {
            String[] split = s[i].split(" ");
            for (int j = 0; j < 3; j++) {
                cost[i][j] = Integer.parseInt(split[j]);
            }
        }


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        cost[i][j] += Math.min(cost[i - 1][j + 1], cost[i - 1][j + 2]);
                        break;
                    case 1:
                        cost[i][j] += Math.min(cost[i - 1][j - 1], cost[i - 1][j + 1]);
                        break;
                    case 2:
                        cost[i][j] += Math.min(cost[i - 1][j - 2], cost[i - 1][j - 1]);
                        break;
                }
            }
        }

        int min = cost[n - 1][0];
        for (int i = 1; i < 3; i++) {
            min = Math.min(min, cost[n - 1][i]);
        }
        bw.write(min + "");
        bw.flush();
        bw.close();
    }
}
