package org.sparta.baekjoon.bycategory.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class NAndM2_15650 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        function(n, m, 0, "");

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static void function(int n, int m, int length, String s) {
        if (length >= m) {
            sb.append(s.trim()).append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!s.contains(String.valueOf(i))) {
                if(!s.isEmpty()){
                    String temp=s.substring(s.length()-1);
                    if(Integer.parseInt(temp)<i) function(n, m, length + 1, s + " " + i);
                }
                else function(n, m, length + 1, s + " " + i);
            }
        }
    }
}
