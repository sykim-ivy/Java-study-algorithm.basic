package basic.ch2;

import java.util.Scanner;

/**
 * Represents the input decimal number as two to 36 hexadecimal numbers.
 * 입력 받은 10진수를 2~36진수로 기수 변환하여 나타냄
 * +) 과정 출력하기
 *
 */
class ch2_q7_ConvRev4_N_Print {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;
        int cd; // 기수 (= 변환할 진수)
        int digit; // 변환 후 자릿수
        int retry; // 재실행여부
        char[] resultCno;

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do{
                System.out.print("변환하는 음이 아닌 정수 : ");
                num = stdIn.nextInt();
            } while (num < 0);

            do{
                System.out.print("어떤 진수로 변환할까요? (2~36) :");
                cd = stdIn.nextInt();
            }while(cd < 2 || cd > 36);

            resultCno = new char[32];
            cardConvR(num, cd, resultCno);

            System.out.print(cd + "진수로는 ");
            for(int i = resultCno.length-1; i >= 0; i--) {
                if(resultCno[i] != '\u0000')
                    System.out.print(resultCno[i]);
            }
            System.out.println();

            System.out.print("한 번 더 할까요?(1:예/2:아니오) : ");
            retry = stdIn.nextInt();
        }while(retry == 1);


    }

    /**
     *
     * @param num : 입력받은 정수값
     * @param r : 변환할 진수
     * @param d : 변환된 값을 아랫자리부터 넣어두고 자릿수를 반환
     * @return
     */
    static int cardConvR(int num, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf("%d|%8d\n", r, num);
        System.out.println(" + ---------");
        do{
            d[digits] = dchar.charAt(num%r);
            num /= r;
            System.out.printf("%d|%8d … %c\n", r, num, d[digits]);
            System.out.println(" + ---------");
            digits++;
        } while (num != 0);

        return digits;
    }
}