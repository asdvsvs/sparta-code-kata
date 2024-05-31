package org.sparta.baekjoon.codeplus.num9374;

import java.io.*;

public class BaekJoon_10973 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split(" ");
        String answer = "";
        boolean bool = false;

        int idx = arr.length - 1;
        int num = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i + 1])) {
                bool = true;
                idx = i;
                num = Integer.parseInt(arr[i]);
                break;
            }
        }

        int idx2 = idx + 1;
        int max = 0;
        for (int i = idx + 1; i < arr.length; i++) {
            int t = Integer.parseInt(arr[i]);
            if (t > max && t < num) {
                idx2 = i;
                max = t;
            }
        }


        if (!bool) {
            answer = "-1";
        } else {
            String temp = arr[idx];
            arr[idx] = arr[idx2];
            arr[idx2] = temp;

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

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
