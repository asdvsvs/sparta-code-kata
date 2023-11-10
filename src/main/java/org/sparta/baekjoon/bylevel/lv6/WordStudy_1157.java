package org.sparta.baekjoon.bylevel.lv6;

import java.io.*;
// 어우 나중에 좀 줄여보자
public class WordStudy_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        int maxCnt=0;
        int manyMax=0;
        String alphabet = "";

        for (char c : s.toUpperCase().toCharArray()){
            if(sb.indexOf(String.valueOf(c))==-1) sb.append(c);
        }
        String removeStr = String.valueOf(sb);
        char[] c = removeStr.toCharArray();
        char[] c1 = s.toUpperCase().toCharArray();
        int[] cnt = new int[c.length];

        for (int i=0; i<c.length;i++){
            for (int j=0; j<s.toUpperCase().length();j++){
                if(c[i]==c1[j])cnt[i]++;
            }
            if(cnt[i]>maxCnt){
                maxCnt=cnt[i];
                alphabet = String.valueOf(c[i]);
            }
        }
        for (int j : cnt) {
            if (maxCnt == j) manyMax++;
        }
        if(manyMax>1) alphabet = "?";
        bw.write(alphabet);
        bw.flush();
        bw.close();
    }
}
