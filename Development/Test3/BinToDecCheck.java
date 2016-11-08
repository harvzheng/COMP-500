import java.util.Scanner;
public class BinToDecCheck{
  private static int convertToDecimal(long binary){
    long n = binary;
    int d = 0;
    int f = 1;

    while(n != 0){
      if(n%10 > 1){
        return -1;
      }
      d += n%10 * f;
      n = n/10;
      f *= 2;
    }
    return d;
  }
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    long n;
    boolean exit = false;

    while(!exit){
      System.out.print("What number would you like to convert from binary to decimal? ");
      n = keyboard.nextLong();
      if(n == 0){
        exit = true;
      }
      if(convertToDecimal(n) != -1){
        System.out.println(convertToDecimal(n));
      } else {
        System.out.println("Input a number in binary!");
      }
    }
  }
}
