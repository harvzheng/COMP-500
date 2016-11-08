import java.awt.Color;
public class PuppyTest{
  public static void niftyMethod(Dog d){
    System.out.println("I'm so nifty!");
  }
  public static void makeOlder(Dog d, int a){
    d.getOlder();
    a = a + 1;
  }
  public static void main(String[] args){
    Dog sparky = null;
    niftyMethod(sparky);
    Dog pete = new Dog(2.5, Color.WHITE);
    int b = 4;
    makeOlder(pete, b);
    System.out.println(pete.getAge() + " " + b);
  }
}
