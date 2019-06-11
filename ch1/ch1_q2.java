package basic.ch1;

import java.util.Scanner;

/**
 * Find Max value of Three Numbers
 * Q1. 사용자에게 입력받은 세 정수 중 최소값을 구하라.
 *
 * >> 경우의 수는 [총 13가지]
 * ------------------------------------------------------------------------------
 * #1) v1, v2, v3가 같지 않은 경우 우위의 경우의 수 : 3!               =  6가지
 * #2) 2개의 숫자만 같아 총 2 가지 우위가 생기는 경우는 3C2 * 2! = 3*2 =  6가지
 * #3) 3개가 모두 같은 경우                                            =  1가지
 * ------------------------------------------------------------------------------
 *   6 + 6 +  1 = 13 가지
 */
public class ch1_q2 {

    static int FindMinValue(int v1, int v2, int v3) {
        int min = v1; // [syk] max에 v1값을 미리 넣으면 if문 하나만 작성해도 됨!

        if(min > v2) min = v2;
        if(min > v3) min = v3;

        return min;
    }


    public static void main(String[] args) {
        int inputInt1, inputInt2, inputInt3;
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최소값을 구합니다.");
        System.out.print("첫번째 값: ");
        inputInt1 = stdIn.nextInt();
        System.out.print("두번째 값: ");
        inputInt2 = stdIn.nextInt();
        System.out.print("세번째(마지막) 값: ");
        inputInt3 = stdIn.nextInt();

        System.out.print("최소값은 " + FindMinValue(inputInt1, inputInt2, inputInt3) + "입니다.");

    }
}
