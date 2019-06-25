package basic.ch1;

import java.util.Scanner;

/**
 * Print * Right angle isosceles triangle
 * 입력한 수를 한 변으로 하는 *기호 직각이등변 삼각형 출력하기 + 왼쪽 아래, 왼쪽 위, 오른쪽 위, 오른쪽 아래가 직각인
 * 각각 함수로 만들기
 */
class ch1_q15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("직각 이등변 삼각형을 출력합니다.");
        int n;
        do {
            System.out.print("단 수 : ");
            n = sc.nextInt();
        }while(n <=0);

        System.out.println("\ntriangleLB");
        triangleLB(n);

        System.out.println("\ntriangleLU");
        triangleLU(n);

        System.out.println("\ntriangleRU");
        triangleRU(n);

        System.out.println("\ntriangleRB");
        triangleRB(n);

    }

    /**
     * 오른쪽 아래가 직각인 함수 출력
     * @param n
     */
    private static void triangleRB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int g = 1; g <= (n-i); g++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 오른쪽 위가 직각인 함수 출력
     * @param n
     */
    private static void triangleRU(int n) {
        for(int i = n; i > 0; i--) {
            for(int g = 1; g <= (n-i); g++) {
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 왼쪽 위가 직각인 함수 출력
     * @param n
     */
    private static void triangleLU(int n) {
        for(int i = n; i > 0; i--) {
            for(int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 왼쪽 아래가 직각인 함수 출력
     * @param n
     */
    private static void triangleLB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}