package org.sparta.programmers.lv3;

public class CaesarCipher {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, int n) {
                StringBuilder answer = new StringBuilder();
                char[] c = s.toCharArray();
                for(int i=0;i<c.length;i++){
                    if(c[i]==' ') answer.append(c[i]);
                    else if((int)c[i]>64&& (int)c[i]<91){
                        c[i] += n;
                        if((int)c[i]>90) c[i]-=26;
                        answer.append(c[i]);
                    }
                    else if((int)c[i]>96&&(int)c[i]<123){
                        c[i] += n;
                        if((int)c[i]>122) c[i] -=26;
                        answer.append(c[i]);
                    }

                }
                return answer.toString();
            }
        }
    }
}
