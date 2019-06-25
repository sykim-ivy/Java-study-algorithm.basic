package basic.ch1;

/**
 * Print Multiplication's table
 * 덧셈표 출력하기 + 더하는 수가 위에 보이도록 수정
 *
 */
class ch1_q13 {

    public static void main(String[] args) {

        System.out.println("--------------- 곱셈표 ----------------");

        for(int g = 0; g < 10; g++) {
            if(g==0) System.out.print("   |");
            else System.out.printf("%2d  ", g);
        }

        System.out.println("\n---+------------------------------------");

        for(int i = 1; i < 10; i++) {
            for(int k = 0; k < 10; k++) {
                if(k==0) {
                    System.out.printf("%2d |",i);
                } else {
                    System.out.printf("%2d",i+k);

                    if(k == 9) System.out.println("");
                    else System.out.print("\t");
                }
            }
        }


    }
}