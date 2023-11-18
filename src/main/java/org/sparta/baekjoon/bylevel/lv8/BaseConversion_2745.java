package org.sparta.baekjoon.bylevel.lv8;

import java.io.*;
import java.util.StringTokenizer;

public class BaseConversion_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int num=0;
        char[] c = s.toCharArray();
        int temp = 1;
        int result = 0;
        for (int i = 1; i <= c.length; i++) {
            num =c[c.length-i];
            if(num<=57) num -=48;
            if (i > 1) temp *= n;
            if (n > 10 && num >= 65) {
                result += (num - 55) * temp;
            } else if (n != 10 && num <= 9) {
                result += num * temp;
            } else if (n == 10) {
                result = Integer.parseInt(s);
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
