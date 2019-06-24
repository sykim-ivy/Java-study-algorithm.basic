package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n using while
 * 1부터 n까지의 합 구하기
 *
 */
class ch1_p4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

        sum = 0;
        i = n;
        while(i > 0) {
            sum += i;
            i--;
        }
        System.out.println(n + "부터 1까지의 합은 " + sum + "입니다.");
    }
}