public class Purchase{
  private int unitPrice;
  private int quantity;
  private int owed;

  public Purchase(int u, int q){
    unitPrice = u;
    quantity = q;
  }

  public int getOwed(){
    return owed;
  }

  public void printChange(int paid){
    owed = paid - unitPrice * quantity;
    System.out.println( "Your change of " + owed + " cents is given as: ");
    int dollarBills = owed/100;
    System.out.println(dollarBills + " one dollar bills");
    owed = owed%100;
    int quarters = owed/25;
    System.out.println(quarters + " quarters");

    owed = owed%25;
    int dimes = owed/10;
    System.out.println(dimes + " dimes");

    owed = owed%10;
    int nickels = owed/5;

    System.out.println(nickels + " nickels");

    owed = owed%5;
    int pennies = owed;
    System.out.println(pennies + " pennies");

    System.out.println("Thank you for participating in Capitalism!");
  }

}
