package org.sparta.baekjoon.bylevel.lv6;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder str2= new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        Collections.reverse(list);
        for (Character s : list) str2.append(s);
        String result="";
        result=str.contentEquals(str2) ? "1":"0";
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
