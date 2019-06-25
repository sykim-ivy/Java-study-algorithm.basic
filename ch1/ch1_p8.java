package basic.ch1;

import java.util.Scanner;

/**
 * Print * Right angle isosceles triangle
 * 입력한 수를 한 변으로 하는 *기호 직각이등변 삼각형 출력하기
 *
 */
class ch1_p8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("직각 이등변 삼각형을 출력합니다.");
        int n;
        do {
            System.out.print("단 수 : ");
            n = sc.nextInt();
        }while(n <=0);

        for(int i = 1; i <= n; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}