package basic.ch2;

/**
 * List prime numbers below 1000
 * 1000 이하의 소수를 나열
 *
 *  +) 소수 'n' = Prime Number 'n'
 *     : 2부터 (n-1)까지의 어떤 정수로도 나누어 떨어지지 않는 수
 *     : 2부터 (n-1)까지의 어떤 **소수**로도 나누어 떨어지지 않는 수
 *     : 2부터 **n의 제곱근 이하의 모든 소수**로 나누어떨어지지 않는 수
 *     : = 1과 자기 자신 'n'만을 약수로 가지는 수
 *
 *  +) 소수는 소수로만 나누어떨어진다고 했다. 그렇다면 나누어 떨어지는 모든 수  = '약수'를 보자.
 *
 *     100의 약수는 (1,2,4,5,10,20,25,50,100)이다.
 *
 *     여기서, 소수가 아닌 (1,100)조합을 제외하고,
 *     (2,50), (4,25), (5,20), (10,10), (20,5), (25,4), (50,2)로 좌표표시시 너비가 100인 사각형을 그린다.
 *     100의 제곱근 (10,10) 조합을 기준으로 대칭을 이루므로 이후의 값으로 나누어지는지 판단하는 것은 의미가 없다.
 *     └> ex) 2로 나뉜다면 굳이 50으로 나뉘는지 또 나눠볼 필요가 없다.
 *     => 그러므로 **n의 제곱근 이하**의 수까지만 나뉘지는지 보면 된다!!
 *
 *     하지만 왜 **n의 제곱근 이하의 모든 소수**만 봐야할까?
 *     (4,25)를 봐보자
 *     4는 소수가 아니다. 2로 나뉘기 떄문이다. 그렇다는건 100도 2로 나뉜다는 말이다.
 *     당연히, 소수가 아닌 수(4)로 나뉘면 그 약수(2)로도 나뉘므로 당연히 소수가 아니다.
 *     (소수로 나뉘는 수도 소수가 아니지만) 이 경우는 굳이 나누볼 필요가 없다는 것이다!
 *
 */
class ch2_q10_PrimeNumber3_SquareRoot {

    public static void main(String[] args) {

        int calcCost = 0;
        int[] prime = new int[500];
        int ptr = 0;

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for(int n = 5; n <= 1000; n += 2) {
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++) { // [comment] '<=' 주의!
                calcCost += 2;
                if(n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                prime[ptr++] = n;
                calcCost++;
            }
        }

        for(int i = 0; i < ptr; i++) System.out.println(prime[i]);
        System.out.println("나눗셈을 수행한 횟수 : " +  calcCost);
    }
}