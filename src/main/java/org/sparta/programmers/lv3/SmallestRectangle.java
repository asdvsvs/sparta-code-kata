package org.sparta.programmers.lv3;

public class SmallestRectangle {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] sizes) {
                int answer = 0;
                int maxx=0;
                int maxy=0;
                for(int i=0;i<sizes.length;i++){
                    if(sizes[i][0] < sizes[i][1]){
                        int temp;
                        temp =sizes[i][0];
                        sizes[i][0]=sizes[i][1];
                        sizes[i][1]=temp;
                    }
                    if(sizes[i][0]>maxx) maxx=sizes[i][0];
                    if(sizes[i][1]>maxy) maxy=sizes[i][1];
                }
                answer = maxx*maxy;
                return answer;
            }
        }
    }
}
