package org.sparta.programmers.lv3;

public class StrangeCharacters_41 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                char[] upStr = s.toUpperCase().toCharArray();
                char[] lowStr = s.toLowerCase().toCharArray();
                int cnt=0;
                for (int i=0;i<s.length();i++){
                    if(upStr[i]==' ') cnt=0;
                    else {
                        if(cnt%2==1) upStr[i] = lowStr[i];
                        cnt++;
                    }
                }
                return new String(upStr);
            }
        }
    }
}
