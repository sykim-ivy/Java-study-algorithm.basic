package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n(n>0) using do-while
 * ch1_p5.java에서 n값을 두 자리 양수로 제한하고 아닌 경우 재입력 받기
 *
 */
class ch1_p6_TwoDigitLimit {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("2자리의 정수를 입력하세요.");

        int n = 0;
        do{
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while(n < 10 || n > 99);

        /**
         * Short circuit evaluation = 단축 평가
         * : AND 조건의 경우 왼쪽조건이 false이면 오른쪽 조건을 판단하지 않음
         * : OR 조건의 경우 왼쪽조건이 true이면 오른쪽 조건을 판단하지 않음
         */

        System.out.println("변수 no의 값은 " + n + "가(이) 되었습니다.");

    }
}