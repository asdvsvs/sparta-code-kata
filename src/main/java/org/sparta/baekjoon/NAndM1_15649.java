package org.sparta.baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NAndM1_15649 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        function(n, m, 0, "", "");

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }


    public static void function(int n, int m, int length, String s, String numStr) {
        if (length >= m) {
            sb.append(s.trim()).append("\n");
            return;
        }


        for (int i = 1; i <= n; i++) {
            if (!numStr.contains(String.valueOf(i))) {
                numStr += i;
                function(n, m, length + 1, s + " " + i, numStr);
                numStr=numStr.substring(0,numStr.length()-1);
            }
        }
    }

}
