package org.sparta.baekjoon.class3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BaekJoon_30804 {
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int fruit = Integer.parseInt(st.nextToken());
            arr[i] = fruit;
        }

        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        int before = 0;
        int point = 0;
        for (int i = 0; i < N; i++) {
            if (set.size() < 2) {
                set.add(arr[i]);
                cnt++;
            } else {
                if (set.contains(arr[i])) {
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 0;
                    set.clear();
                    before = 0;
                    i = point - 1;
                    continue;
                }
            }

            max = Math.max(max, cnt);
            if (before != arr[i]) {
                point = i;
                before = arr[i];
            }
        }


        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
