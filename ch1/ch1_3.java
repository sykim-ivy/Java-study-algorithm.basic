package basic.ch1;

import java.util.Scanner;

/**
 * Find Middle value of Three Numbers
 * 사용자에게 입력받은 세 정수 중 중간값을 구하라.
 *
 * >> 다양한 알고리즘이 나올 수 있다.
 * >> 후에 퀵정렬에서도 이용되는 알고리즘
 */
class ch1_3 {

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

    /**
     * 예제와 다르게 2개 숫자가 같은 경우, 중앙값이 없다는 의미로 null을 리턴하도록 수정
     * @param i1
     * @param i2
     * @param i3
     * @return
     */
    private static Integer getMedValue(int i1, int i2, int i3) {
        // 입력 숫자가 3개라 같은 수를 미리 리턴하지만 입력 숫자가 많아지면?
        if(i1 == i2 || i1 == i3 || i2 == i3) {
            return null;
        }

        if(i2 > i1) {
            if(i3 > i2) { // i2 > i1
                return i2;
            } else if(i1 > i3){ // i2 > i1 && i2 > i3
                return i1;
            } else { // i2 > i1 && i2 > i3 && i3 > i1
                return i3;
            }
        } else if(i3 > i1) { // i1 > i2
            return i1;
        } else if(i2 > i3) { // i1 > i2 && i1 > i3
            return i2;
        } else{ // i1 > i2 && i1 > i3 && i3 > i2
            return i3;
        }
    }
}