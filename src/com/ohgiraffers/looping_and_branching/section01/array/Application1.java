package com.ohgiraffers.looping_and_branching.section01.array;

public class Application1 {

    public static void main(String[] args) {
        /*배열의 선언 및 할당*/
        int[] arr = new int[5];

        /*하나의 이름으로 관리되는 연속된 메모리공간이고, 공간마다 찾아갈 수 있는 변호(인덱스)를 이용해 접근한다.*/
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /*인덱스를 반복문으로 처리해서 값을 대입할수있다.*/
        for(int i = 0, value = 0; i < arr.length; i++){
            arr[i] = value += 10;
        }
        /*일반적인 변수처럼 사용할수도 있다.*/

        int sum = 0;

        sum+= arr[0];
        sum+= arr[1];
        sum+= arr[2];
        sum+= arr[3];
        sum+= arr[4];

        sum = 0;
        /*인덱스를 반복문으로 활용해서 처리*/
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
