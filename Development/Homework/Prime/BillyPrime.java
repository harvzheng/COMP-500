public class BillyPrime {

    //public static boolean testPrime() {
    public static void main(String[] args) {

        int amountPrimes = 0;
        int currentNum = 2;
        int maxNum = 100;
        int divisor;
        boolean isPrime;

        while(currentNum < maxNum + 1) {
            divisor = currentNum / 2;
            isPrime = true;
            while(divisor > 1) {
                if(currentNum % divisor == 0){
                    isPrime = false;
                }
                divisor -= 1;
            }
            if(isPrime){
                amountPrimes ++;
            }
            currentNum++;
        }
        System.out.println("There are " + amountPrimes + " primes between 1 and " + maxNum);
    }
}
