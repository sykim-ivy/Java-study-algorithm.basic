package basic.ch1;

import java.util.Scanner;

/**
 * ch_p4.java에서 while문 종료시 i값이 n+1 / 0이 됨을 확인
 *
 */
class ch1_q6 {

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
        System.out.println("i = " + i);

        sum = 0;
        i = n;
        while(i > 0) {
            sum += i;
            i--;
        }
        System.out.println(n + "부터 1까지의 합은 " + sum + "입니다.");
        System.out.println("i = " + i);
    }
}