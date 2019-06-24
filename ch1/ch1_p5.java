package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n using for
 * 1부터 n까지의 합 구하기
 *
 */
class ch1_p5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = stdIn.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

        sum = 0;
        for(int i = n; i > 0; i--) {
            sum += i;
        }
        System.out.println(n + "부터 1까지의 합은 " + sum + "입니다.");
    }
}