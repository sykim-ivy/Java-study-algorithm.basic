package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n using for
 * ch1_p5.java에서 더하는 값들 출력하기
 *
 */
class ch1_q7 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = stdIn.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print(i);
            if(i != n)
                System.out.print(" + ");
            sum += i;
        }
        System.out.println(" = " + sum);

        sum = 0;
        for(int i = n; i > 0; i--) {
            System.out.print(i);
            if(i != 1)
                System.out.print(" + ");
            sum += i;
        }
        System.out.println(" = " + sum);
    }
}