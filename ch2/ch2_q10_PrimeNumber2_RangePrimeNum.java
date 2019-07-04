package basic.ch2;

/**
 * List prime numbers below 1000
 * 1000 이하의 소수를 나열
 *
 *  +) 소수 'n' = Prime Number 'n'
 *     : 2부터 (n-1)까지의 어떤 정수로도 나누어 떨어지지 않는 수
 *     : 2부터 (n-1)까지의 어떤 **소수**로도 나누어 떨어지지 않는 수
 *
 *  +) 4이상의 짝수는 2로 나누어떨어지므로 모두 소수가 아니다.
 */
class ch2_q10_PrimeNumber2_RangePrimeNum {

    public static void main(String[] args) {

        int calcCost = 0;
        int[] prime = new int[500];
        int ptr = 0;

        prime[ptr++] = 2;
        for(int n = 3; n <= 1000; n += 2) { // [comment] 2가 소수라 모든 짝수는 소수가 아니게 된다. 그러므로 반복을 홀수만 하도록 증가값을 +=2로 설정
            int i;
            for(i = 1; i < ptr; i ++) { // [comment] n은 증가값상 홀수이므로 prime[0]의 값 2는 안나뉘므로 나누어볼 필요가 없어 i는 1부터 시작한다.
                calcCost++;
                if(n % prime[i] == 0) {
                    break;
                }
            }

            if(i == ptr) {
                prime[ptr++] = n;
            }
        }

        for(int i = 0; i < ptr; i++) System.out.println(prime[i]);
        System.out.println("나눗셈을 수행한 횟수 : " +  calcCost);
    }
}