package org.sparta.baekjoon.bylevel.lv8;

import java.io.*;
import java.util.StringTokenizer;

public class BaseConversion_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder strBuilder = new StringBuilder();
        String result ="";
        char c=' ';
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int temp=1;
        while (n/b>=temp){
            temp*=b;
        }
        for(int i=temp;i>=1;i/=b){
            if(b==10){
                result = String.valueOf(n);
                break;
            }
            else if(n/i>=10){
                c= (char) (n/i+55);
            }else {
                c= (char) (n/i+48);
            }
            strBuilder.append(c);
            n=n%i;
        }
        if(b!=10)result = String.valueOf(strBuilder);
        bw.write(result+" ");
        bw.flush();
        bw.close();

    }
}
