package basic.ch2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Copying all elements of array 'arr' in reverse order to array 'brr'
 * 배열 'arr'의 요소를 역순으로 배열 'brr'에 복사하기
 *
 */
class ch2_q5_ArrayCopyInReverse {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟 수: ");
        int arrNum = stdIn.nextInt();

        int[] arr = new int[arrNum];
        for(int i = 0; i < arrNum; i++) {
            System.out.print("arr[" + i +"] : ");
            arr[i] = stdIn.nextInt();
        }

        int[] brr = reverseCopy(arr);

        System.out.println("\narr 배열의 요소를 brr 배열에 역순으로 복사했습니다.");
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("brr : " + Arrays.toString(brr));

    }

    private static int[] reverseCopy(int[] originalArr) {
//        int[] arr = originalArr.clone();
        int[] arr = new int[originalArr.length];

        if(originalArr.length%2 == 1) {
            int midIdx = (originalArr.length/2);
            arr[midIdx] = originalArr[midIdx];
        }

        for(int i = 0, k = (arr.length - 1); i < (arr.length/2); i++, k--) {
            int temp = originalArr[i];
            arr[i] = originalArr[k];
            arr[k] = temp;
        }

        return arr;
    }
}