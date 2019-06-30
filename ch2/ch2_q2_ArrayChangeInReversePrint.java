package basic.ch2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Organizing array elements in reverse order
 * ch2_p6_ArrayChangeInReverse.java(배열 요소를 역순으로 정리하고) 과정 출력하기
 *
 */
class ch2_q2_ArrayChangeInReversePrint {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟 수: ");
        int peopleNum = stdIn.nextInt();

        int[] height = new int[peopleNum];
        for(int i = 0; i < peopleNum; i++) {
            System.out.print("height[" + i +"] : ");
            height[i] = stdIn.nextInt();
        }

        reverse(height);

    }

    private static void reverse(int[] arr) {
        for(int i = 0, k = (arr.length - 1); i < (arr.length/2); i++, k--) {
            arrSwap(arr, i, k);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    private static void arrSwap(int[] arr, int aIdx, int bIdx) {
        int temp = arr[aIdx];
        System.out.printf("arr[%d]와 arr[%d]를 교환합니다.\n", aIdx, bIdx);
        arr[aIdx] = arr[bIdx];
        arr[bIdx] = temp;
    }

}