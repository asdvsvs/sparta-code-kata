package org.sparta.baekjoon.bylevel.lv1;

import java.io.*;
import java.util.StringTokenizer;

//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//문제의 조건을 잘 읽자
// 당연히 int는 안되고 Long을 사용해서 런타임 에러 (NumberFormat) 오류가 났다.
public class ChildJungmin_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a =Long.parseLong(st.nextToken());
        Long b =Long.parseLong(st.nextToken());
        Long c =Long.parseLong(st.nextToken());
        Long result =a+b+c;
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}
