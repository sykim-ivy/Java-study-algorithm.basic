package basic.ch1;

import java.util.Scanner;

/**
 * Find Max value of Four Numbers
 * Q1. 사용자에게 입력받은 네 정수 중 최대값을 구하라.
 *
 * >> 경우의 수는 [총 69가지]
 * ------------------------------------------------------------------------------
 * #1) v1, v2, v3, v4가 같지 않은 경우 우위의 경우의 수 : 4!           =  24가지
 * #2) 2개의 숫자만 같아 총 3 가지 우위가 생기는 경우는 4C2 * 3! = 6*6 =  36가지
 * #3) 3개의 숫자만 같아 총 2 가지 우위가 생기는 경우는 4C3 * 2! = 4*2 =  8가지
 * #4) 4개가 모두 같은 경우                                            =  1가지
 * ------------------------------------------------------------------------------
 *   24 + 36 +  8 + 1 = 69 가지
 *
 */
public class ch1_q1 {

    static int FindMaxValue(int v1, int v2, int v3, int v4) {
        int max = v1; // [syk] max에 v1값을 미리 넣으면 if문 하나만 작성해도 됨!
        if(max < v2) max = v2;

        if(max < v3) max = v3;
        if(max < v4) max = v4;

        return max;
    }


    public static void main(String[] args) {
        int inputInt1, inputInt2, inputInt3, inputInt4;
        Scanner stdIn = new Scanner(System.in);

        System.out.println("네 정수의 최댓값을 구합니다.");
        System.out.print("첫번째 값: ");
        inputInt1 = stdIn.nextInt();
        System.out.print("두번째 값: ");
        inputInt2 = stdIn.nextInt();
        System.out.print("세번째 값: ");
        inputInt3 = stdIn.nextInt();
        System.out.print("네번째(마지막) 값: ");
        inputInt4 = stdIn.nextInt();

        System.out.print("최대값은 " + FindMaxValue(inputInt1, inputInt2, inputInt3, inputInt4) + "입니다.");

    }
}
