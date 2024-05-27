package org.sparta.baekjoon.codeplus.num9371;
//https://www.acmicpc.net/board/view/58247

import java.io.*;

public class BaekJoon_3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                char[][] copy = getCopy(n, arr);
                char temp = copy[i][j - 1];
                copy[i][j - 1] = copy[i][j];
                copy[i][j] = temp;
                max = rowCount(n, copy, max);
                max = colCount(n, copy, max);

                if (i < n - 1) {
                    copy = getCopy(n, arr);
                    copy[i][j - 1] = copy[i + 1][j - 1];
                    copy[i + 1][j - 1] = temp;
                    max = rowCount(n, copy, max);
                    max = colCount(n, copy, max);
                }

            }
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    private static int rowCount(int n, char[][] copy, int max) {
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (copy[i][j - 1] == copy[i][j]) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    cnt = 1;
                }
            }
        }
        return max;
    }

    private static int colCount(int n, char[][] copy, int max) {
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (copy[j - 1][i] == copy[j][i]) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    cnt = 1;
                }
            }
        }
        return max;
    }

    private static char[][] getCopy(int n, char[][] arr) {
        char[][] copy = new char[n][n];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                copy[a][b] = arr[a][b];
            }
        }
        return copy;
    }
}
