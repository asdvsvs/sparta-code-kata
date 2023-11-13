package org.sparta.baekjoon.bylevel.lv6;

import java.io.*;
import java.util.StringTokenizer;


public class YourAvgScore_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sumCredit=0;
        double sumScore=0;
        for(int i=0; i<20;i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String scoreStr = st.nextToken();
            switch (scoreStr) {
                case "A+": sumScore += credit* 4.5;break;
                case "A0": sumScore += credit* 4.0;break;
                case "B+": sumScore += credit* 3.5;break;
                case "B0": sumScore += credit* 3.0;break;
                case "C+": sumScore += credit* 2.5;break;
                case "C0": sumScore += credit* 2.0;break;
                case "D+": sumScore += credit* 1.5;break;
                case "D0": sumScore += credit* 1.0;break;
                case "F": sumScore += 0;break;
                case "P": break;
            }
            if(!scoreStr.equals("P")) sumCredit +=credit;
        }
        System.out.printf("%.6f",sumScore/sumCredit);
    }
}
