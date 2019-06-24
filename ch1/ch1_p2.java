package basic.ch1;

/**
 * Find Max value of Three Numbers
 * 사용자에게 입력받은 세 정수 중 최대값을 찾기를 모든 경우 출력해보기
 *
 * >> 최대값 구하는 로직을 함수로 만듦
 */
class ch1_p2 {

    public static void main(String[] args) {
        System.out.println("3개의 수 중 최대값은 getMaxValue(3, 2, 1) = " + getMaxValue(3, 2, 1) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(3, 2, 2) = " + getMaxValue(3, 2, 2) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(3, 1, 2) = " + getMaxValue(3, 1, 2) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(3, 2, 3) = " + getMaxValue(3, 2, 3) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(2, 1, 3) = " + getMaxValue(2, 1, 3) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(3, 3, 2) = " + getMaxValue(3, 3, 2) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(3, 3, 3) = " + getMaxValue(3, 3, 3) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(2, 2, 3) = " + getMaxValue(2, 2, 3) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(2, 3, 1) = " + getMaxValue(2, 3, 1) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(2, 3, 2) = " + getMaxValue(2, 3, 2) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(1, 3, 2) = " + getMaxValue(1, 3, 2) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(2, 3, 3) = " + getMaxValue(2, 3, 3) + " 입니다.");
        System.out.println("3개의 수 중 최대값은 getMaxValue(1, 2, 3) = " + getMaxValue(1, 2, 3) + " 입니다.");

    }

    private static int getMaxValue(int i1, int i2, int i3) {
        int result = i1;
        if(result < i2) {
            result = i2;
        }
        if(result < i3) {
            result = i3;
        }
        return result;
    }
}