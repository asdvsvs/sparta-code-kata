package org.sparta.baekjoon.bylevel.lv1;

import java.io.*;

public class Multiplication_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = num1*num2;
        for(int i=0;i<3;i++){
            bw.write(num1*(num2%10)+"\n");
            num2/=10;
        }
        bw.write(num3+"\n");
        bw.flush();
        bw.close();
    }
}
