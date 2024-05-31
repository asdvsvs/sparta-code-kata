package org.sparta.baekjoon.codeplus.num9374;

import java.io.*;

public class BaekJoon_10972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split(" ");
        String answer = "";

        int idx = arr.length - 1;
        int num1 = Integer.parseInt(arr[arr.length - 1]);
        boolean bool = false;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[i + 1])) {
                bool = true;
                idx = i;
                num1 = Integer.parseInt(arr[i]);
                break;
            }
        }

        if (arr.length == 1) {
            answer = arr[0];
        } else {
            int min = 10000;
            int idx2 = 0;

            for (int i = idx + 1; i < arr.length; i++) {
                int t = Integer.parseInt(arr[i]);
                if (t > num1 && min > t) {
                    idx2 = i;
                    min = t;
                }
            }
            String tmp = arr[idx];
            arr[idx] = arr[idx2];
            arr[idx2] = tmp;

            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i <= idx) {
                    if (i != arr.length - 1) {
                        answer += arr[i] + " ";
                    } else {
                        answer += arr[i];
                    }
                    cnt++;
                } else {
                    int k = arr.length - 1 + cnt - i;
                    if (i != arr.length - 1) {
                        answer += arr[k] + " ";
                    } else {
                        answer += arr[k];
                    }
                }
            }
        }
        if (!bool) {
            answer = "-1";
        }

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
