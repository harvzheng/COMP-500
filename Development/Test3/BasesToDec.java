import java.util.Scanner;
public class BasesToDec{
  private static int convertToDecimal(long binary, int b){
    long n = binary;
    int d = 0;
    int f = 1;
    int base = b;
    if(base > 9 || base < 1){
      return -1;
    }
    while(n != 0){
      if(n%10 > b - 1){
        return -1;
      }
      d += n%10 * f;
      n = n/10;
      f *= b;
    }
    return d;
  }
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    long n;
    int base;
    boolean exit = false;

    while(!exit){
      System.out.print("What base would you like to convert from? ");
      base = keyboard.nextInt();

      System.out.print("What number would you like to convert to decimal in your base? ");
      n = keyboard.nextLong();
      if(n == 0){
        exit = true;
      }
      if(convertToDecimal(n, base) != -1){
        System.out.println(convertToDecimal(n, base));
      } else {
        System.out.println("Input correctly!");
      }
    }
  }
}
