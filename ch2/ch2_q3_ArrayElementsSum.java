package basic.ch2;

import java.util.Scanner;

/**
 * Get a sum of all values ​​in the array
 * 배열 모든 요소의 합 구하기
 *
 */
class ch2_q3_ArrayElementsSum {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열의 모든 요소의 합을 구합니다.");
        System.out.print("요솟 수: ");
        int arrNum = stdIn.nextInt();

        int[] arr = new int[arrNum];
        for(int i = 0; i < arrNum; i++) {
            System.out.print("arr[" + i +"] : ");
            arr[i] = stdIn.nextInt();
        }
        System.out.println("배열 요소의 합은 " + sumOf(arr) + "입니다.");

    }

    private static int sumOf(int[] arr) {
        if(arr == null && arr.length ==0) return -1;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}