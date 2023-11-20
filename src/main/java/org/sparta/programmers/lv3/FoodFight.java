package org.sparta.programmers.lv3;

public class FoodFight {
    public static void main(String[] args) {
        class Solution {
            public String solution(int[] food) {
                String answer = "";
                int cnt=0;
                for(int i=1;i<food.length;i++){
                    cnt=food[i]/2;
                    for(int j=0;j<cnt;j++){
                        answer+=String.valueOf(i);
                    }
                }
                int temp=answer.length();
                answer+="0";
                for(int i=temp-1;i>=0;i--){
                    answer+=answer.charAt(i);
                }
                return answer;
            }
        }
    }
}
