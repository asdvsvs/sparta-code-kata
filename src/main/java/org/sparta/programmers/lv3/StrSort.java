package org.sparta.programmers.lv3;

import java.util.Arrays;

public class StrSort {
    public static void main(String[] args) {
        class Solution {
            public String[] solution(String[] strings, int n) {
                String[] answer = new String[strings.length];
                Word[] word = new Word[strings.length];
                for (int i = 0; i < strings.length; i++) {
                    word[i] = new Word(strings[i], strings[i].charAt(n));
                }
                Arrays.sort(word);
                for (int i=0;i< word.length; i++){
                    answer[i]=word[i].word;
                }
                return answer;
            }

            static class Word implements Comparable<Word> {
                String word;
                char c;

                public Word(String word, char c) {
                    this.word = word;
                    this.c = c;
                }

                @Override
                public int compareTo(Word o) {
                    if(this.c<o.c) return -1;
                    else if(this.c>o.c) return 1;
                    else return this.word.compareTo(o.word);
                }
            }
        }
    }
}
