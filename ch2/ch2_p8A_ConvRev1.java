package basic.ch2;

import java.util.Scanner;

/**
 * Represents the input decimal number as two to 36 hexadecimal numbers.
 * 입력 받은 10진수를 2~36진수로 기수 변환하여 나타냄
 *
 */
class ch2_p8A_ConvRev1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("변환할 값: ");
        int inputInt1 = stdIn.nextInt();
        System.out.print("변활할 진수값: ");
        int rev = stdIn.nextInt();

        cardConvR(inputInt1, rev, new char[32]);
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

        do{
            d[digits++] = dchar.charAt(num%r);
            num /= r;
        } while (num != 0);

        for(int i = d.length; i > 0; i--) {
            System.out.print(d[i-1]);
        }

        return digits;
    }
}