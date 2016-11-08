import java.util.Scanner;
public class Cashier{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to Capitalism");
    System.out.print("Enter unit price (in cents): ");
    int unitPrice = kb.nextInt();
    System.out.print("Enter the quantity (in cents): ");
    int quantity = kb.nextInt();
    Purchase p = new Purchase(unitPrice, quantity);
    System.out.print("Enter the paid amount (in cents): ");
    int amountPaid = kb.nextInt();

    if(p.getOwed() < amountPaid){
      p.printChange(amountPaid);
    } else {
      System.out.println("You need to pay more!");
    }

  }
}
