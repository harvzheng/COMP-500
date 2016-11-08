public class Problem2{
  public static void main(String[] args){
    int a = 1;
    int b = 1;
    int c;
    int sum = 0;
    while (a < 4000000){
      if(a % 2 == 0){
        sum += a;
      }
      a += b;
      if(b % 2 == 0){
        sum += b;
      }
      b += a;
    }
    System.out.println(sum);
  }
}
