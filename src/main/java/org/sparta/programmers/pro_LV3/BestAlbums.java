package org.sparta.programmers.pro_LV3;

//https://school.programmers.co.kr/learn/courses/30/lessons/42579#

import java.util.*;

public class BestAlbums {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] genres, int[] plays) {
                List<Integer> aList = new ArrayList<>();

                // <장르,<인덱스,재생횟수>>에 담음
                Map<String, Map<Integer, Integer>> map = new HashMap<>();
                for (int i = 0; i < genres.length; i++) {
                    if (map.get(genres[i]) == null) {
                        map.put(genres[i], new HashMap<>());
                    }
                    map.get(genres[i]).put(i, plays[i]);
                }

                // <각 장르의 재생횟수 합,장르> 담음
                Map<Integer, String> total = new HashMap<>();
                map.forEach((key, value) -> {
                    int sum = 0;
                    for (int i : value.values()) {
                        sum += i;
                    }
                    total.put(sum, key);
                });

                // 장르 재생횟수 합을 담은 배열 정렬
                int[] arr = new int[total.size()];
                int cnt1 = 0;
                for (int i : total.keySet()) {
                    arr[cnt1] = i;
                    cnt1++;
                }
                Arrays.sort(arr);

                // 로직 시작
                for (int i = arr.length - 1; i >= 0; i--) {
                    String str = total.get(arr[i]);
                    int[] size = new int[map.get(str).keySet().size()];

                    // 장르의 재생횟수 정렬
                    int cnt = 0;
                    for (int j : map.get(str).values()) {
                        size[cnt] = j;
                        cnt++;
                    }
                    Arrays.sort(size);

                    // 재생횟수 최대값과 같은 인덱스 리스트에 추가
                    List<Integer> list = new ArrayList<>();
                    map.get(str).forEach((key, value) -> {
                        if (value == size[size.length - 1]) {
                            list.add(key);
                        }
                    });

                    // 리스트 사이즈가 2 이상이면 정렬 후 제일 작은 인덱스 2개 정답배열에 입력
                    if (list.size() >= 2) {
                        Collections.sort(list);
                        aList.add(list.get(0));
                        aList.add(list.get(1));
                    }
                    // 리스트 사이즈가 1이므로 0번째를 정답배열에 담음
                    else {
                        aList.add(list.get(0));

                        // https://school.programmers.co.kr/questions/46247
                        if (size.length != 1) {
                            list.clear();
                            // 다음 최대값과 같은 인덱스 리스트에 추기
                            map.get(str).forEach((key, value) -> {
                                if (value == size[size.length - 2]) {
                                    list.add(key);
                                }
                            });
                            // 정렬 후 0번째 정답배열에 담음
                            Collections.sort(list);
                            aList.add(list.get(0));
                        }
                    }

                }

                int[] answer = new int[aList.size()];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = aList.get(i);
                }

                return answer;
            }
        }
    }
}
