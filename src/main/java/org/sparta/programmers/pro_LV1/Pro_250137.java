package org.sparta.programmers.pro_LV1;

//https://school.programmers.co.kr/questions/76177
public class Pro_250137 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] bandage, int health, int[][] attacks) {
                int answer = 0;
                int continuousS = 0;
                int endTime = attacks[attacks.length - 1][0];
                int nextAttack = 0;
                int max = health;

                for (int i = 0; i <= endTime; i++) {
                    if (attacks[nextAttack][0] == i) {
                        health -= attacks[nextAttack][1];
                        if (health <= 0) {
                            health = -1;
                            break;
                        }
                        nextAttack++;
                        continuousS = 0;
                    } else {
                        health += bandage[1];

                        if (continuousS == bandage[0]) {
                            health += bandage[2];
                            continuousS = 0;
                        }
                        if (health > max) {
                            health = max;
                        }
                    }
                    continuousS++;
                }

                answer = health;

                return answer;
            }
        }
    }
}
