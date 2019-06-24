package basic.ch1;

/**
 * Find Middle value of Three Numbers
 * 사용자에게 입력받은 세 정수 중 중간값을 찾기를 모든 경우 출력해보기
 *
 * >> 최대값 구하는 로직을 함수로 만듦
 */
class ch1_q4 {

    public static void main(String[] args) {
        System.out.println("3개의 수(3, 2, 1) 중 중앙값은 " + printMedValue(getMedValue(3, 2, 1)));
        System.out.println("3개의 수(3, 2, 2) 중 중앙값은 " + printMedValue(getMedValue(3, 2, 2)));
        System.out.println("3개의 수(3, 1, 2) 중 중앙값은 " + printMedValue(getMedValue(3, 1, 2)));
        System.out.println("3개의 수(3, 2, 3) 중 중앙값은 " + printMedValue(getMedValue(3, 2, 3)));
        System.out.println("3개의 수(2, 1, 3) 중 중앙값은 " + printMedValue(getMedValue(2, 1, 3)));
        System.out.println("3개의 수(3, 3, 2) 중 중앙값은 " + printMedValue(getMedValue(3, 3, 2)));
        System.out.println("3개의 수(3, 3, 3) 중 중앙값은 " + printMedValue(getMedValue(3, 3, 3)));
        System.out.println("3개의 수(2, 2, 3) 중 중앙값은 " + printMedValue(getMedValue(2, 2, 3)));
        System.out.println("3개의 수(2, 3, 1) 중 중앙값은 " + printMedValue(getMedValue(2, 3, 1)));
        System.out.println("3개의 수(2, 3, 2) 중 중앙값은 " + printMedValue(getMedValue(2, 3, 2)));
        System.out.println("3개의 수(1, 3, 2) 중 중앙값은 " + printMedValue(getMedValue(1, 3, 2)));
        System.out.println("3개의 수(2, 3, 3) 중 중앙값은 " + printMedValue(getMedValue(2, 3, 3)));
        System.out.println("3개의 수(1, 2, 3) 중 중앙값은 " + printMedValue(getMedValue(1, 2, 3)));
    }
    
    private static String printMedValue(Integer medValue) {
        if(medValue == null) {
            return "찾을 수 없습니다.";
        } else {
            return "중앙값은 " + medValue ;
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