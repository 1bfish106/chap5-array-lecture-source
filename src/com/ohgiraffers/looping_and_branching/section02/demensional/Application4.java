package com.ohgiraffers.looping_and_branching.section02.demensional;

public class Application4 {
    public static void main(String[] args) {
        //2차원 배열의 선언과 할당 및 초기화를 동시에 할 수 있다.

        //정변 배열
        int[][] iarr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        //arr[1][2] -> 8값이 나옴
        //반복문을 이용한 출력

        for(int i = 0; i < iarr.length; i++){
            for(int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println("  ");
        }

        //가변배열
        int[][] iarr2 = {{1,2,3},{4,5},{6,7,8,9,10}};

        for(int i = 0; i < iarr2.length; i++){
            for(int j = 0; j < iarr2[i].length; j++){
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }


        //미리 할당된 배열을 이용한 방식
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[][] iarr3 = {arr1,arr2};

        for(int i = 0; i < iarr3.length; i++){
            for(int j = 0; j < iarr3[i].length; j++){
                System.out.print(iarr3[i][j] + " ");
            }
            System.out.println();
        }

        }

    }
