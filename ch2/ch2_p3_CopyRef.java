package basic.ch2;


/**
 * Array
 * 배열의 copy the array's address reference.
 */
class ch2_p3_CopyRef {

    public static void main(String[] args) {
        int[] arr = {4, 0, 0, 16, 64}; // 배열 선언 & 요소값 대입

        // print 'arr'
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();

        int[] brr = arr; // copy the array's address reference. So, 'arr' and 'brr' have a same address value
        brr[0] = 100;
        brr[1] = 200;
        brr[2] = 300;

        // print 'arr'
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}