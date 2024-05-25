package org.sparta.baekjoon.codeplus.num9371;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaekJoon_2309 {
    static List<Integer> answer = new ArrayList<>();
    static boolean bool = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dfs(arr, 0, 0, new ArrayList<>(), new boolean[9]);
        Collections.sort(answer);
        for (int i : answer) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }

    static void dfs(int[] arr, int depth, int sum, List<Integer> list, boolean[] visited) {
        if (depth == 7 || bool) {
            if (sum == 100) {
                answer.addAll(list);
                bool = true;
            }
            return;
        }

        for (int i = depth; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(arr[i]);
                sum += arr[i];
                dfs(arr, depth + 1, sum, list, visited);
                visited[i] = false;
                list.remove(Integer.valueOf(arr[i]));
                sum -= arr[i];
            }
        }
    }
}
