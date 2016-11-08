import java.awt.Color;
public class Puppy extends Dog{
  private boolean isHouseTrained;

  public Puppy(double a, Color c){
    super(a, c);
  }

  public void bark(){
    super.bark();
    System.out.println("arf! ruff!");
  }
}
