package basic.ch1;

import java.util.Scanner;

/**
 * Sum of 1 to n(n>0) using do-while
 * ch1_p6_TwoDigitLimit.java 조건에 드모르간 법칙 적용
 *
 */
class ch1_p6_TwoDigitLimit_DeMorganLaws {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("2자리의 정수를 입력하세요.");

        int n = 0;
        do{
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while(!(n >= 10 && n <= 99)); // << while(n < 10 || n > 99);에 드모르간 법칙 적용한 법칙
        
        /**
         * De Morgan's Laws = 드모르간 법칙
         * : 각 조건을 부정하고,
         *   논리곱을 논리합으로 그 반대로도 서로 바꾼후
         *   이 전체 조건을 부정하면 원래의 조건과 같다.
         */

        System.out.println("변수 no의 값은 " + n + "가(이) 되었습니다.");

    }
}