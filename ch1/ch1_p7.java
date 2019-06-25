package basic.ch1;

import java.util.Scanner;

/**
 * Print Multiplication's table
 * 곱셈표 출력하기
 *
 */
class ch1_p7 {

    public static void main(String[] args) {

        System.out.println("----- 곱셈표 ------");

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.printf("%2d",i*j);
                if(j == 9) System.out.println("");
                else System.out.print("\t");
            }
        }


    }
}