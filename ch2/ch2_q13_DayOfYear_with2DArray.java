package basic.ch2;

import java.util.Scanner;

/**
 * 올해가 며칠 지났는지 2차원 배열을 사용하여 구하기
 *
 * 평년 : 100으로 나누어떨어지고, 400으로 나누어 떨어지지 않는 해
 * 윤년 : 4로 나누어 떨어지면서 평년이 아닌 해
 */
class ch2_q13_DayOfYear_with2DArray {

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30} // 윤년
    };

    /**
     * 윤년인지 여부 (true: 윤년 / false: 평년)
     * @param year
     * @return
     */
    static boolean isLeap(int year) {
        return (year%4 == 0) && (year%100 != 0) && (year%400 == 0);
    }

    static int dayOfYear(int y, int m, int d) {
        int days = d;
        int mdaysIdx = (isLeap(y)) ? 1 : 0;
        for(int i = 1; i < m; i++) { // [comment] 'int i = 1; i < m;' << 당월의 일수는 d에 포함되었으므로 포함하지 않음
            days += mdays[mdaysIdx][i-1];
        }
        return days;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        boolean isRetry;
        do{
            System.out.println("그 해의 경과 일 수를 구합니다.");
            System.out.print("년: ");
            int year = stdIn.nextInt();
            System.out.print("월: ");
            int month = stdIn.nextInt();
            System.out.print("일: ");
            int day = stdIn.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1:예 / 0: 아니오)");
            isRetry = (stdIn.nextInt() == 1) ? true : false;
        } while(isRetry);
    }
}