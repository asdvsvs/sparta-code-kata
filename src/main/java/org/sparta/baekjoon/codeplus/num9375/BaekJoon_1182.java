package org.sparta.baekjoon.codeplus.num9375;
//https://www.acmicpc.net/board/view/138831

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1182 {
    static int cnt = 0;
    static boolean bool = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        function(n, s, 0, 0, arr);

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }

    static void function(int n, int s, int idx, int sum, int[] arr) {
        if (bool && sum == s) {
            cnt++;
        }
        bool = true;
        for (int i = idx; i < n; i++) {
            function(n, s, i + 1, sum + arr[i], arr);
        }
    }
}
