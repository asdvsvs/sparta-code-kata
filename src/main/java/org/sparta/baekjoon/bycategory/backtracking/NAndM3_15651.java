package org.sparta.baekjoon.bycategory.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class NAndM3_15651 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        printSeq(0,n,m,"");
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    static void printSeq(int length,int n, int m, String temp) {
        if (length >= m) {
            sb.append(temp.trim()).append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            printSeq(length + 1,n,m, temp + " " + i);
        }
    }
}
