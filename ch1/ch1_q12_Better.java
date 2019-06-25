package basic.ch1;

/**
 * Print Multiplication's table
 * 곱셈표 출력하기 + 곱하는 수가 위에 보이도록 수정
 *
 */
class ch1_q12_Better {

    public static void main(String[] args) {

        System.out.println("--------------- 곱셈표 ----------------");

        for(int g = 0; g < 10; g++) {
            if(g==0) System.out.print("   |");
            else System.out.printf("%2d  ", g);
        }

        System.out.println("\n---+------------------------------------");

        for(int i = 1; i < 10; i++) {
            System.out.printf("%2d |",i);
            for(int k = 1; k < 10; k++) {
                    System.out.printf("%2d",i*k);

                    if(k == 9) System.out.println("");
                    else System.out.print("\t");
            }
        }


    }
}