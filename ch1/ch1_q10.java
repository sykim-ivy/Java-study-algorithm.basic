package basic.ch1;

import java.util.Scanner;

/**
 * Sub b - a but b > a
 * b - a를 구하고 a가 더 큰 입력값이면 재입력 받기
 *
 */
class ch1_q10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("b-a 값을 구합니다.");
        int a, b;
        while(true) {
            System.out.print("a값: ");
            a = stdIn.nextInt();

            System.out.print("b값: ");
            b = stdIn.nextInt();

            if(b <= a){
                System.out.println("b는 a보다 큰 값을 입력하세요!");
            } else {
                break;
            }
        }

        System.out.println(b + " - " + a + " = " + (b-a) + "입니다.");
    }

}