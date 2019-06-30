package basic.ch2;

import java.util.Scanner;

/**
 * Find Max value from Array
 * 배열 요소의 최댓값 구하기
 *
 */
class ch2_p4_ArrayMaxValueFind {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int peopleNum = stdIn.nextInt();

        int[] height = new int[peopleNum];
        for(int i = 0; i < peopleNum; i++) {
            System.out.print("height[" + i +"] : ");
            height[i] = stdIn.nextInt();
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