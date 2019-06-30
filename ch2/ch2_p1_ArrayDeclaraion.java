package basic.ch2;


/**
 * Array
 * 배열 : 같은 자료형(=타입)들이 모여 이루어진 자료구조.
 */
class ch2_p1_ArrayDeclaraion {

    public static void main(String[] args) {
        int[] arr = new int[5]; // 배열 선언

        // 배열 요소에 값 대입
        arr[0] = 4;
        arr[3] = arr[0] * 4;
        arr[4] = arr[3] * 4;

        // 배열 크기 length는 배열의 구성 요소의 수이므로 1부터라 (인덱스 최대값 + 1)값
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}