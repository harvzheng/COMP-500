public class Question5{
  public static String lastFour(String c){
    int length = c.length();
    String last4 = c.substring(length - 4);
    return last4;
  }
  public static void main(String[] args){
      String ccNumber = "1234 1234 4213 2142";
      System.out.println(lastFour(ccNumber));
  }
}
