package org.sparta.baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 컴패러블 사용법 숙지!!!!!!
public class KoreanEnglishMath_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n= Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            students[i]=new Student(
                    st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }
        Arrays.sort(students);
        for (Student s : students){
            bw.write(s.name+"\n");
        }
        bw.flush();
        bw.close();
    }

    static class Student implements Comparable<Student>{
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Student o) {
            int com1 = Integer.compare(o.korean,korean);
            if(com1 == 0){
                int com2 = Integer.compare(english,o.english);
                if(com2 ==0){
                    int com3 = Integer.compare(o.math,math);
                    if (com3==0){
                        int com4 = this.name.compareTo(o.name);
                        return com4;
                    }
                    return com3;
                }
                return com2;
            }
            return com1;
        }
    }
}

