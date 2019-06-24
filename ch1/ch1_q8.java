package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n using Addition of Gauss
 * 가우스 덧셈으로 1부터 n까지의 합 구하기
 *
 */
class ch1_q8 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = stdIn.nextInt();

        int sum = 0;
        int halfInt = n/2;

        sum += (n + 1) * (halfInt);
        if(n%2 != 0) {
            sum += halfInt + 1;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

    }
}