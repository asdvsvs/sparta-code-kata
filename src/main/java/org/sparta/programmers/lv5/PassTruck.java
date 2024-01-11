package org.sparta.programmers.lv5;

import java.util.LinkedList;
import java.util.Queue;

public class PassTruck {


    public static void main(String[] args) {
        class Solution {

            public int solution(int bridge_length, int weight, int[] truck_weights) {
                int answer = 0;

                int[] truckLocation = new int[truck_weights.length];
                Queue<Integer> onBridge = new LinkedList<>();
                int currentWeight = 0;

                for (int i = 0; i < truck_weights.length; i++) {
                    if (currentWeight + truck_weights[i] > weight) {
                        while (currentWeight + truck_weights[i] > weight) {
                            //다리 위 트럭위치 ++
                            for (int j : onBridge) {
                                truckLocation[j]++;
                            }
                            answer++;
                            //맨 앞 트럭 다리 건넜으면 onBridge에서 빼고 현재무게에서 트럭무게 빼기
                            if (truckLocation[onBridge.peek()] > bridge_length) {
                                currentWeight -= truck_weights[onBridge.poll()];
                            }
                        }
                        onBridge.add(i);
                        currentWeight += truck_weights[i];
                        truckLocation[i]++;
                    } else {
                        onBridge.add(i);
                        currentWeight += truck_weights[i];
                        //다리 위 트럭위치 ++
                        for (int j : onBridge) {
                            truckLocation[j]++;
                        }
                        answer++;
                        if (truckLocation[onBridge.peek()] > bridge_length) {
                            currentWeight -= truck_weights[onBridge.poll()];
                        }
                    }
                }

                return answer + bridge_length;
            }
        }
    }
}
