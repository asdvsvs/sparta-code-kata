package org.sparta.baekjoon.codeplus.num9376;

import java.io.*;

public class BaekJoon_15990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        long[] arr = new long[100001];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 3;
        String[] s = new String[100001];
        s[1] = "1 0 0";
        s[2] = "0 1 0";
        s[3] = "1 1 1";

        for (int i = 4; i < arr.length; i++) {
            long one = (Long.parseLong(s[i - 1].split(" ")[1]) + Long.parseLong(s[i - 1].split(" ")[2])) % 1000000009;
            long two = (Long.parseLong(s[i - 2].split(" ")[0]) + Long.parseLong(s[i - 2].split(" ")[2])) % 1000000009;
            long three = (Long.parseLong(s[i - 3].split(" ")[0]) + Long.parseLong(s[i - 3].split(" ")[1])) % 1000000009;
            s[i] = one + " " + two + " " + three;
            arr[i] = (one + two + three) % 1000000009;
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[n] + "\n");
        }
        bw.flush();
        bw.close();
    }
}