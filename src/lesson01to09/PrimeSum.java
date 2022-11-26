package lesson01to09;
/*
 * Сумма простых чисел от 1 до 10
 */
public class PrimeSum {

    static int primeSum(int count) {
        int sum = 0;

        for(int i = 0, primeNum = 1; i < count; i++) {
            primeNum = nextPrimeNumber(primeNum+1);
            sum += primeNum;
            System.out.printf("prime number = %d\n",primeNum);
        }

        return sum;
    }
    
    static int nextPrimeNumber(int num) {
        while(!isPrime(num)) {
            num += 1;
        }
        return num;
    }

    static boolean isPrime(int num) {
        if(num == 1) return false;
        return isPrime(num, (int)Math.sqrt(num));
    }

    private static boolean isPrime(int num, int div) {
        if(div == 1) return true;
        if(num % div == 0) return false;

        return isPrime(num, div-1);
    }


    public static void main(String[] args) {
        System.out.printf("sum = %d", primeSum(10));
    }
}
