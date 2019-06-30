package basic.ch2;

import java.util.Scanner;

/**
 * Compare two arrays equally
 * 두 배열이 같은지 비교하기
 *
 */
class ch2_p7_ArraysEquals {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요솟 수: ");
        int arrNum = stdIn.nextInt();
        int[] arr = new int[arrNum];

        inputArrayValue(arr, stdIn);

        System.out.print("배열 b의 요솟 수: ");
        int brrNum = stdIn.nextInt();
        int[] brr = new int[brrNum];

        inputArrayValue(brr, stdIn);


        System.out.println("배열 a와 b는 "
                + (equals(arr, brr) ? "같습니다." : "다릅니다.")
        );

    }

    private static boolean equals(int[] arr, int[] brr) {
        if(arr.length == brr.length) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != brr[i]) return false;
            }
            return true;
        }
        return false;
    }

    private static void inputArrayValue(int[] arr, Scanner stdIn) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i +"] : ");
            arr[i] = stdIn.nextInt();
        }
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