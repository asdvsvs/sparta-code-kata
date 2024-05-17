package org.sparta.baekjoon.bylevel.lv23;

import java.io.*;

public class BaekJoon_9184 {
    static int[][][] abc = new int[101][101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();
            if (s.equals("-1 -1 -1")) {
                break;
            }
            String[] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            bw.write("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");
        }
        bw.flush();
        bw.close();
    }

    static int w(int a, int b, int c) {
        if (abc[a + 50][b + 50][c + 50] != 0) {
            return abc[a + 50][b + 50][c + 50];
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            abc[a + 50][b + 50][c + 50] = 1;
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            int n = w(20, 20, 20);
            abc[a + 50][b + 50][c + 50] = n;
            return n;
        } else if (a < b && b < c) {
            int n = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            abc[a + 50][b + 50][c + 50] = n;
            return n;
        } else {
            int n = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
            abc[a + 50][b + 50][c + 50] = n;
            return n;
        }
    }
}