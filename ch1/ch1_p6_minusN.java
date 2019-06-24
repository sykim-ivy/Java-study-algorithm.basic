package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n
 * ch1_p5.java에서 n값을 음수로 입력한 경우에도 합 구하기
 *
 */
class ch1_p6_minusN {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;
        if(n > 0) {
            for(; i <= n; i++) {
                sum += i;
            }
        } else {
            for(; i >= n; i--) {
                sum += i;
            }
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

    }
}