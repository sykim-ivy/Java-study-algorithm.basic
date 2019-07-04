package basic.ch2;

import java.util.Scanner;

/**
 * List prime numbers below 1000
 * 1000 이하의 소수를 나열
 *
 *  +) 소수 'n' = Prime Number 'n' : 2부터 (n-1)까지의 어떤 정수로도 나누어 떨어지지 않는 수
 */
class ch2_q9_PrimeNumber1 {

    public static void main(String[] args) {

        int calcCost = 0;
        for(int i = 2; i <= 1000; i++) {
            int k;
            for(k = 2; k < i; k++) {
                calcCost++;
                if(i%k == 0) {
                    break;
                }
            }

            if(k == i) {
                System.out.println(i);
            }
        }
        System.out.println("나눗셈을 수행한 횟수 : " +  calcCost);
    }
}