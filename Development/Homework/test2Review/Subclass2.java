public class Subclass2 extends Base1{
  private int a=3;
  public void printStuff(){
    System.out.println(a);
    System.out.println(super.a);
  }

  public static void main(String[] args){
    Subclass2 example = new Subclass2();
    example.printStuff();
  }
}
