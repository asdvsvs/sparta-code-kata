package org.sparta.programmers.pro_LV1;

public class WallpaperClear {

    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] wallpaper) {
                int[] answer = {-1,-1,-1,-1};

                for (int i=0;i<wallpaper.length;i++){
                    if(wallpaper[i].contains("#")) {
                        if(answer[0]==-1)answer[0]= i;
                        else answer[2]=i+1;
                    }
                }
                for(int i=0; i<wallpaper[0].length();i++){
                    for(String s : wallpaper){
                        if(s.charAt(i)=='#') {
                            if(answer[1]==-1) answer[1]=i;
                            else answer[3]=i+1;
                        }
                    }
                }
                if(answer[2]==-1) answer[2]=answer[0]+1;
                if (answer[3]==-1) answer[3]=answer[1]+1;

                return answer;
            }
        }
    }

}
