
public class Counter{
  public static void main(String[] args){
    int i = 0;
    while(i < 100){
      System.out.println(i);
      Thread.sleep(1000);
      i++;
    }
  }
}
