public class Subclass1 extends Base1{
  private int a = 3;
  public void printStuff(){
    System.out.println(a);
    System.out.println(a);
  }
  public static void main(String[] args){
    Subclass1 example = new Subclass1();
    example.printStuff();
  }
}
