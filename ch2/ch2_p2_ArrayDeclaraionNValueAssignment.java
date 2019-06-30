package basic.ch2;


/**
 * Array
 * 배열 : 같은 자료형(=타입)들이 모여 이루어진 자료구조.
 */
class ch2_p2_ArrayDeclaraionNValueAssignment {

    public static void main(String[] args) {
        int[] arr = {4, 0, 0, 16, 64}; // 배열 선언 & 요소값 대입
//        arr[0] = 4;
//        arr[3] = arr[0] * 4;
//        arr[4] = arr[3] * 4;

        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}