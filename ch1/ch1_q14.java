package basic.ch1;

import java.util.Scanner;

/**
 * Print * Sqeare
 * 입력한 수를 한 변으로 하는 *기호 정사각형 출력하기
 *
 */
class ch1_q14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        int n;
        do {
            System.out.print("단 수 : ");
            n = sc.nextInt();
        }while(n <=0);

        for(int i = 0; i < n; i++) {
            for(int k = 0; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}