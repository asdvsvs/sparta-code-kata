package org.sparta.programmers.pro_LV1;

public class WallpaperClear2 {

    public static void main(String[] args) {
        class Solution {

            public int[] solution(String[] wallpaper) {
                int[] answer = new int[4];

                for (int i = 0; i < wallpaper.length; i++) {
                    if (wallpaper[i].contains("#")) {
                        answer[0] = i;
                        break;
                    }
                }

                loop1:
                for (int i = 0; i < wallpaper[0].length(); i++) {
                    for (int j = 0; j < wallpaper.length; j++) {
                        if (wallpaper[j].charAt(i) == '#') {
                            answer[1] = i;
                            break loop1;
                        }
                    }
                }

                for (int i = wallpaper.length - 1; i >= 0; i--) {
                    if (wallpaper[i].contains("#")) {
                        answer[2] = i + 1;
                        break;
                    }
                }

                loop2:
                for (int i = wallpaper[0].length() - 1; i >= 0; i--) {
                    for (int j = 0; j < wallpaper.length; j++) {
                        if (wallpaper[j].charAt(i) == '#') {
                            answer[3] = i + 1;
                            break loop2;
                        }
                    }
                }

                return answer;
            }
        }
    }
}
