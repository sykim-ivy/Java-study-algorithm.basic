package basic.ch2;

import java.util.Random;
import java.util.Scanner;

/**
 * Make Array using java.util.Random & Find a max value of array Components
 * 난수 사용해 배열 요소값 설정하고 최대값 구하기
 *
 */
class ch2_p5_ArraySetRandomElements_N_FindMaxValue {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int peopleNum = stdIn.nextInt();

        int[] height = new int[peopleNum];

        System.out.println("키 값은 아래와 같습니다.");
        for(int i = 0; i < peopleNum; i++) {
            height[i] = 100 + rand.nextInt(90); // 0부터 89까지의 난다.
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