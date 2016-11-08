import java.util.Scanner;

public class Test{
  public static boolean unrequitedLove(int a, int b){
    if(((a > b || a < 3) && (b > a || b < 3)) || ((b > 3 && a > 3) && b == a)){
      return false;
    } else if((a > b || a < 3) || (b > a || b < 3)) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args){
    // Scanner kb = new Scanner(System.in);
    //
    // System.out.print("value of a? ");
    // int a = kb.nextInt();
    // System.out.print("value of b? ");
    // int b = kb.nextInt();
    //
    // System.out.println(unrequitedLove(a, b));
    int test = 2;
    switch (test) {
      case 1 || 2:
        System.out.println("or");
        break;
      case 3:
        System.out.println("not or");
        break;
      default:
        break;
    }
  }
}
