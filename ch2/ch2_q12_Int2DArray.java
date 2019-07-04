package basic.ch2;

import java.util.Scanner;

/**
 * 자바 - 2차원 배열
 *
 * : 배열의 배열 = 배열을 값으로 가지는 배열 = 배열을 참조하는 배열
 *
 */
class ch2_q12_Int2DArray {

    public static void main(String[] args) {
        int[][] x = new int[2][4];

        x[0][1] = 37;
        x[0][3] = 54;
        x[1][2] = 65;

        for(int i = 0; i < x.length; i++) {
            for(int k = 0; k < x[i].length; k++) {
                System.out.printf("x[%d][%d] = %d\n", i, k, x[i][k]);
            }
        }

    }
}