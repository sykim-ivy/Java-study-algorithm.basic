package basic.ch1;

import java.util.Scanner;

/**
 * Print Row Number Tree
 * 입력한 수만큼 행을 가지는 행숫자 트리 출력하기
 *
 */
class ch1_q17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        int n;
        do {
            System.out.print("단 수 : ");
            n = sc.nextInt();
        }while(n <=0);

        npira(n);
        npira2(n);
    }

    /**
     * 뒤에 여백까지 넣어버린 내가 만든 거
     * @param n
     */
    private static void npira(int n) {
        System.out.println("npira() 트리를 출력합니다.");
        for(int i = 1, g = n; i <= n; i++, g--) {
            for(int k = 1; k <= ((n-1)*2 + 1); k++) {
                if(k >= g && k < g + (i*2-1)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 책이 한 방향대로 맞춰 작성해 본 것
     * @param n
     */
    static void npira2(int n) {
        System.out.println("spira2() 트리를 출력합니다.");
        for (int i = 0; i < n; i++) { 					// i행 (i = 1, 2, … ,n)
            for(int k = 1; k < n-i; k++) {
                System.out.print(" ");
            }
            for(int h = 1; h <= 2*i+1; h++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}