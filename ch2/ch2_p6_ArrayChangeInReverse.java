package basic.ch2;

import java.util.Scanner;

/**
 * Organizing array elements in reverse order
 * 배열 요소를 역순으로 정리하기
 *
 */
class ch2_p6_ArrayChangeInReverse {

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

        System.out.println("요소를 역순으로 정렬했습니다.");

        for(int i = 0; i < peopleNum; i++) {
            System.out.println("height[" + i +"] : " + height[i]);
        }


    }

    private static void reverse(int[] arr) {
        for(int i = 0, k = (arr.length - 1); i < (arr.length/2); i++, k--) {
            int temp = arr[i];
            arr[i] = arr[k]; // [syk] k = (arr.length - 1 - i)
            arr[k] = temp;
        }
    }
}