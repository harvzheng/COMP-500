/**
 * Created by harvey on 10/9/16.
 */

public class Primes {
    public static boolean isPrime(int n){
        int number = n;
        int sqrtNum = (int)Math.sqrt(number);
        int counter = 2;
        while(counter < sqrtNum + 1){
            if(number % counter == 0){
                return false;
            }
            counter ++;
        }
        return true;
    }

    public static void main(String[] args){
        long startTime = System.nanoTime();
        int maxNum = 10001;
        int counter = 2;
        int numPrimes = 0;
        int thePrime = 0;
        // while(counter < maxNum + 1){
        //     if(Primes.isPrime(counter)) numPrimes ++;
        //     counter ++;
        // }
        while(numPrimes < maxNum){
            if(Primes.isPrime(counter)) numPrimes ++;
            if(numPrimes == maxNum && Primes.isPrime(counter)) thePrime = counter;
            counter ++;
        }
        long endTime = System.nanoTime();
        // System.out.println("There are " + numPrimes + " primes between 1 and " + maxNum);
        System.out.println("took " + ((endTime - startTime)/1000000 + " milliseconds "));
        System.out.println(thePrime);
    }
}
