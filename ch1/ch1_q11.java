package basic.ch1;

import java.util.Scanner;

/**
 * Find digit N (N>0)
 * 양의 정수의 자릿수 구하기
 *
 */
class ch1_q11 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n1부터 n2까지의 합을 구합니다.");
        System.out.print("n1값: ");
        int n1 = stdIn.nextInt();

        String n1Str = n1+"";
        System.out.println(n1 + "은 " + n1Str.length() + "자리 입니다.");
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