package basic.ch2;

import java.util.Scanner;

/**
 * Create a method copy that copies all the elements of array 'arr' to array 'brr'.
 * 배열 'arr'의 모든 요소를 배열 'brr'에 복사하는 메서드 copy를 작성하세요.
 *
 */
class ch2_q4_ArrayCopy {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 arr의 요솟 수: ");
        int arrNum = stdIn.nextInt();
        int[] arr = new int[arrNum];

        inputArrayValue(arr, stdIn);

        int[] brr = copy(arr);

        System.out.println("복사된 배열 brr");
        for(int i = 0; i < brr.length; i++) {
            System.out.println("brr[" + i +"] : " + brr[i]);
        }
    }

    private static int[] copy(int[] arr) {
        int[] copyArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    private static void inputArrayValue(int[] arr, Scanner stdIn) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i +"] : ");
            arr[i] = stdIn.nextInt();
        }
    }
}