package org.sparta.programmers;



public class ParkWalk {

    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] park, String[] routes) {

                int[] row = {0,0,1,-1};
                int[] col = {1,-1,0,0};
                int currentRow =0;
                int currentCol =0;

                for(int i=0;i<park.length;i++){
                    if(park[i].contains("S")){
                        currentRow = i;
                        break;
                    }
                }

                for(int i=0;i<park[currentRow].length();i++){
                    if(park[currentRow].charAt(i)=='S'){
                        currentCol = i;
                        break;
                    }
                }

                for(String s : routes){
                    String direction = s.substring(0,1);
                    int distance = Integer.parseInt(s.substring(2,3));

                    if(direction.equals("E")){
                        int temp=0;
                        for(int i=0;i<distance;i++){
                            if(currentCol == park[0].length()-1){
                                currentCol-=temp;
                                break;
                            }
                            if(park[currentRow].charAt(currentCol+1)=='X') {
                                currentCol-=temp;
                                break;
                            }
                            currentCol++;
                            temp++;
                        }
                    }
                    else if(direction.equals("W")){
                        int temp=0;
                        for(int i=0;i<distance;i++){
                            if(currentCol == 0) {
                                currentCol+=temp;
                                break;
                            }
                            if(park[currentRow].charAt(currentCol-1)=='X') {
                                currentCol+=temp;
                                break;
                            }
                            currentCol--;
                            temp++;
                        }
                    }
                    else if(direction.equals("N")){
                        int temp=0;
                        for(int i=0;i<distance;i++){
                            if(currentRow == 0){
                                currentRow+=temp;
                                break;
                            }
                            if(park[currentRow-1].charAt(currentCol)=='X'){
                                currentRow+=temp;
                                break;
                            }
                            currentRow--;
                            temp++;
                        }
                    }
                    else if(direction.equals("S")){
                        int temp=0;
                        for(int i=0;i<distance;i++){
                            if(currentRow == park.length-1) {
                                currentRow-=temp;
                                break;
                            }
                            if(park[currentRow+1].charAt(currentCol)=='X') {
                                currentRow-=temp;
                                break;
                            }
                            currentRow++;
                            temp++;
                        }
                    }
                }

                int[] answer = {currentRow,currentCol};
                return answer;
            }
        }
    }
}
