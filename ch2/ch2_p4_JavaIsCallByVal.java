package basic.ch2;

import java.util.Arrays;

/**
 * Java is Call by value!!
 * 자바는 항상 Call by value이다!
 *
 */
class ch2_p4_JavaIsCallByVal {

    static class ObjClassVar {
        int propertyIntVar;
        ObjClassVar(int val) {
            this.propertyIntVar = val;
        }
    }


    public static void main(String[] args) {

        int primitVar = 10;
        Integer refVar = 10;
        ObjClassVar objClassVal = new ObjClassVar(10);
        int[] arrVar = {10, 10, 10};

        // Primitive Type Variable
        System.out.println("\n[Before] int primitVar = " + primitVar);
        plus10Toint(primitVar);
        System.out.println("[After]  int primitVar = " + primitVar);

        // Reference Wrapper Type Variable
        System.out.println("\n[Before] Integer refVar = " + refVar);
        plus10ToInteger(refVar);
        System.out.println("[After]  Integer refVar = " + refVar);

        // Reference Object Type Variable
        System.out.println("\n[Before] ObjClassVar objClassVal.propertyIntVar = " + objClassVal.propertyIntVar);
        plus10ToObject(objClassVal);
        System.out.println("[After]  ObjClassVar objClassVal.propertyIntVar = " + objClassVal.propertyIntVar);

        // Reference Array Type Variable
        System.out.println("\n[Before] arrVar = " + Arrays.toString(arrVar));
        plus10ToArray(arrVar);
        System.out.println("[After]  arrVar = " + Arrays.toString(arrVar));


    }

    private static void plus10Toint(int a) {
        a+=10;
    }

    private static void plus10ToInteger(Integer a) {
        a+=10;
    }

    private static void plus10ToObject(ObjClassVar a) {
        a.propertyIntVar += 10;
    }

    private static void plus10ToArray(int[] arr) {
        // 배열의 모든 요소에 10을 더함
        for(int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }
}