package org.sparta.baekjoon.bylevel.lv6;

import java.io.*;

public class GroupWordChecker_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        String str = "";

        for (int i = 0; i < n;i++) {
            str = br.readLine();
            if(str.length()==1)cnt++;
            else{
                boolean[] bool = new boolean[26];
                for (int j = 1; j < str.length(); j++) {
                    bool[str.charAt(0)-97]=true;
                    if (str.charAt(j - 1) != str.charAt(j)) {
                        int alpha = str.charAt(j) - 97;
                        if (bool[alpha]) break;
                        bool[alpha] = true;
                    }
                    if (j == str.length()-1) cnt++;
                }
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();

    }
}
