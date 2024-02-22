package org.sparta.programmers.pro_LV0;

import java.util.HashMap;
import java.util.Map;

public class MorseCode1 {

    public static void main(String[] args) {
        class Solution {

            public String solution(String letter) {
                String answer = "";

                Map<String, String> map = new HashMap<>();
                String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";

                morse = morse.replace("'", "");
                String[] m = morse.split(",");
                for (String s : m) {
                    String[] temp = s.split(":");
                    map.put(temp[0], temp[1]);
                }

                String[] str = letter.split(" ");
                for (String s : str) {
                    answer += map.get(s);
                }

                return answer;
            }
        }
    }
}
