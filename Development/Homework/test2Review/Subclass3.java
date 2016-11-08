public class Subclass3 extends Base2{
  private int a = 3;
  public void printStuff(){
    super.printStuff();
    System.out.println(a);
  }

  public static void main(String[] args){
     Subclass3 example = new Subclass3();
     example.printStuff();
  }
}
