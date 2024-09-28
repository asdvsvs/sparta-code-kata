package org.sparta.baekjoon.class3;

import java.io.*;

public class BaekJoon_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cal = 0;
        String s = br.readLine();
        String[] minus = s.split("-");
        for (int i = 0; i < minus.length; i++) {
            String[] plus = minus[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < plus.length; j++) {
                sum += Integer.parseInt(plus[j]);
            }
            if (i == 0) {
                cal += sum;
            } else {
                cal -= sum;
            }
        }

        bw.write(cal + "");
        bw.flush();
        bw.close();

    }
}
