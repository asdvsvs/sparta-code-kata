package org.sparta.programmers.lv4;

public class OurPassword {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, String skip, int index) {
                String answer = "";
                char[] sToChar = s.toCharArray();
                for(char c : sToChar){
                    for(int i=0;i<index;i++){
                        c++;
                        if(c==(int)'{') c=(int)'a';
                        while(skip.contains(String.valueOf(c)))c++;
                        if(c==(int)'{') c=(int)'a';
                    }
                    answer+=String.valueOf(c);
                }
                return answer;
            }
        }

    }
}
