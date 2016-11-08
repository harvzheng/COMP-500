public class Problem10{
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
    long sum = 0;
    int maxNum = 2000000;
    for(int i = 2; i < maxNum; i++){
      if(isPrime(i)){
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
