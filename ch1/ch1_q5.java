package basic.ch1;

import java.util.Scanner;

/**
 * Find Middle value of Three Numbers
 * >> Why it worse than ch1_p3.java ??
 *
 *  조건식은 조건 false이면 이후 else문이나 else-if문에서 당연히 이전 조건이 false인 상태로 재확인 필요가 없지만
 *  아래와 같이 작성하면 매번
 *  b>=a, b<=a, a>b, a<b 와 같이 조건 확인이 불필요하게 늘어나 효율이 떨어진다.
 *
 *  ▽ 출판사 답
 *  	연습1-5 해답
 *  	가장 처음의 if문의 판단
 *  	if ((b >= a && c<= a) || (b <= a && c >= a))
 *  	에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의
 *  	else if ((a > b && c < b) || (b <= a && c > b))
 *  	으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.
 *
 */
class ch1_q5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값: ");
        int inputInt1 = stdIn.nextInt();

        System.out.print("b의 값: ");
        int inputInt2 = stdIn.nextInt();

        System.out.print("c의 값: ");
        int inputInt3 = stdIn.nextInt();

        Integer medValue = getMedValue(inputInt1, inputInt2, inputInt3);

        if(medValue == null) {
            System.out.println("3개의 수 중 2개가 같아 중앙값을 찾을 수 없습니다.");
        } else {
            System.out.println("중앙값은 " + medValue  + " 입니다.");
        }

    }

    private static Integer getMedValue(int a, int b, int c) {
        if(( b >= a && c <= a) || (b <= a && a <= c)) {
            return a;
        }
        else if( (a > b && c < b) && ( a < b && c > b)) {
            return b;
        }
        else
            return c;
    }
}