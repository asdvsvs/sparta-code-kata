package org.sparta.baekjoon.bylevel.lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Dog_10172 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("|\\_/|\n" +
                "|q p|   /}\n" +
                "( 0 )\"\"\"\\\n" +
                "|\"^\"`    |\n" +
                "||_/=\\\\__|");
        bw.flush();
        bw.close();
    }
}
