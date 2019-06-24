package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n(n>0) using do-while
 * ch1_p5.java에서 n값을 음수로 입력한 경우 재입력 받기
 *
 */
class ch1_p6 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");

        int n = 0;
        do{
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while(n <= 0);

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

    }
}