package org.sparta.baekjoon.codeplus.num9370;
//https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-4375-1-java

import java.io.*;
import java.math.BigInteger;

public class BaekJoon_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            BigInteger n = new BigInteger(input);
            BigInteger base = BigInteger.ZERO;
            while (true) {
                base = base.multiply(BigInteger.TEN).add(BigInteger.ONE);
                if (base.mod(n).equals(BigInteger.ZERO)) {
                    bw.write(base.toString().length() + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
