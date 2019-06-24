package basic.ch1;

import java.util.Scanner;

/**
 * Sum of n1 to n2
 * n1부터 n2 사이의 모든 정수의 합을 구하기
 *
 */
class ch1_q9 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n1부터 n2까지의 합을 구합니다.");
        System.out.print("n1값: ");
        int n1 = stdIn.nextInt();

        System.out.print("n2값: ");
        int n2 = stdIn.nextInt();


        System.out.println(n1 + "부터 " + n2 + "까지의 합은 " + sumof(n1, n2) + "입니다.");
    }

    private static int sumof(int a, int b) {
        int sum = 0;
        // 아래 for 문의 a가 b보다 작을때이므로 반대인 경우 a,b값을 바꿈
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for(int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}