package org.sparta.programmers.lv3;

public class NumberWord {
    public static void main(String[] args) {
        class Solution {
            public int solution(String s) {
                int answer = 0;
                String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
                for(int i=0;i<word.length;i++){
                    s=s.replace(word[i],String.valueOf(i));
                }
                answer = Integer.parseInt(s);
                return answer;
            }
        }
    }
}
