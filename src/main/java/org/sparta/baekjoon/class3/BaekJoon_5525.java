package org.sparta.baekjoon.class3;

import java.io.*;

public class BaekJoon_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("IO");
        }
        sb.append("I");
        String str = sb.toString();

        int cnt = 0;
        for (int i = 0; i <= M - str.length(); i++) {
            String temp = s.substring(i, str.length() + i);
            if (str.equals(temp)) {
                cnt++;
                i++;
            }
        }


        bw.write(cnt + "");
        bw.flush();
        bw.close();

    }
}
