package org.sparta.baekjoon.bylevel.lv6;

import java.io.*;
//별찍기 왤케 어려움 ㄷㄷ
public class TakeStar_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int space =n-1;
        for (int i = 0; i <= 2*(n-1); i++) {
            for(int j=0;j<space;j++){
                bw.write(" ");
            }
            bw.write("*");
            for(int k=1;k<n-space;k++){
                bw.write("**");
            }
            if(i<n-1)space--;
            else space++;
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
