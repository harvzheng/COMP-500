import java.awt.Color;

public class Dog{
  private double age;
  private Color dogColor;

  public Dog(double a, Color c){
    age = a;
    dogColor = c;
  }

  public double getAge(){
    return age;
  }

  public void getOlder(){
    age++;
  }

  public void bark(){
    System.out.println("Woof");
  }
  public void staticBark(){
    System.out.println("Woof");
  }
}
