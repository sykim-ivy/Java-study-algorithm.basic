package basic.ch2;


/**
 * Array
 * 배열의 copy the array's all components. So, 'arr' and 'brr' have a same address value
 */
class ch2_p3_CopyVal {

    public static void main(String[] args) {
        int[] arr = {4, 0, 0, 16, 64}; // 배열 선언 & 요소값 대입

        // print 'arr'
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        System.out.println();

        int[] brr = arr.clone(); // copy the array's all components. So, 'brr' value reference other data copying 'arr''s components
        brr[0] = 100;
        brr[1] = 200;
        brr[2] = 300;

        // print 'arr'
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        // print 'brr'
        for(int i = 0; i < brr.length; i++) {
            System.out.println("brr[" + i + "] = " + brr[i]);
        }
    }
}