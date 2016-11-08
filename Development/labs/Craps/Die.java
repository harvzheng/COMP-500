import java.*;
public class Die{
  private int roll1;
  private int roll2;
  public int total;
  public void roll(){
    roll1 = (int)(Math.random() * 7);
    roll2 = (int)(Math.random() * 7);
  }

  public int getNumDots(){
    int total = roll1 + roll2;
    return total;
  }
  public static void main(String[] args){
    Die die = new Die();
    die.roll();
    System.out.println(die.getNumDots());
    die.roll();
    System.out.println(die.getNumDots());
    die.roll();
    System.out.println(die.getNumDots());
    die.roll();
    System.out.println(die.getNumDots());
    die.roll();
    System.out.println(die.getNumDots());
  }
}
