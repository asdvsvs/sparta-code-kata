package org.sparta.baekjoon.bylevel.lv6;

import java.io.*;

public class CroatiaAlphabet_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for (String s : croatia){
            str = str.replace(s, "a");
        }

        bw.write(str.length() + "");
        bw.flush();
        bw.close();
    }
}
