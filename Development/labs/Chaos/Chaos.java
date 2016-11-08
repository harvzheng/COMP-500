//Harvey and Jacob
import java.util.Scanner;
// chaos is my isStable
public class Chaos{

  public static boolean chaos(double x, double y){
    int n = 3000;
    ComplexPoint original = new ComplexPoint(x, y);
    ComplexPoint copy = original;
    int counter = 0;
    while(copy.isWithinRadius(2)){
      if(counter < n){
        copy = copy.square().add(original);
        counter ++;
      } else{
        return true;
      }
    }
    return false;
  }
  public static int numIterations(double x, double y){
    int n = 1000;
    ComplexPoint original = new ComplexPoint(x, y);
    ComplexPoint copy = original;
    int counter = 0;
    while(copy.isWithinRadius(2)){
      if(counter < n){
        copy = copy.square().add(original);
        counter ++;
      } else{
        return -1;
      }
    }
    return counter;
  }
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    String xInput, yInput;
    double x, y;
    boolean exit = false;

    while(!exit){
      System.out.print("What would you like for the x coordinate? ");
      xInput = kb.nextLine();
      System.out.print("What would you like for the y coordinate? ");
      yInput = kb.nextLine();

      if(xInput.trim().equals("") || yInput.trim().equals("")){
        exit = true;
      } else {
        x = Double.parseDouble(xInput);
        y = Double.parseDouble(yInput);
        System.out.println(Chaos.chaos(x, y));
      }
    }
  }
}
