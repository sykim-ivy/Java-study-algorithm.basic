package basic.ch2;

import java.util.Random;
import java.util.Scanner;

/**
 * Make PeopleNum and Array using java.util.Random & Find a max value of array Components
 * ch2_5.java에서 난수 사용해 사람 수도 정하고 배열 요소값 설정하고 최대값 구하기
 *
 */
class ch2_q1_ArraySetRandomSizeNElements_N_FindMaxValue {

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int peopleNum = rand.nextInt(10) + 1; // 1부터 10까지의 난수를 생성.

        int[] height = new int[peopleNum];

        System.out.println("키 값은 아래와 같습니다.");
        for(int i = 0; i < peopleNum; i++) {
            height[i] = 100 + rand.nextInt(90); // 0부터 89까지의 난수를 생성.
            System.out.println("height[" + i +"]  : " + height[i]);
        }
        System.out.println("키의 최댓값은 " + maxOf(height) + "입니다.");

    }

    private static int maxOf(int[] arr) {
        if(arr == null && arr.length ==0) return -1;
        int maxV = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxV) {
                maxV = arr[i];
            }
        }
        return maxV;
    }
}