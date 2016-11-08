import java.awt.*;
import javax.swing.*;

public class AmericanFlag extends JFrame{
  private static int stripeHeight = 20;
  private static int stripeWidth = 420;
  private static int blueRectHeight = stripeHeight * 5;
  private static int blueRectWidth = 180;
  public AmericanFlag(){
    setSize(800, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public void paint(Graphics g){
    for(int i = 1; i < 14; i++){
      if(i%2 == 0){
        g.setColor(Color.WHITE);
        g.fillRect(10, stripeHeight * i + 10, stripeWidth, stripeHeight );
      } else{
        g.setColor(Color.RED);
        g.fillRect(10, stripeHeight * i + 10, stripeWidth, stripeHeight );
      }
    }
    g.setColor(Color.BLUE);
    g.fillRect(10, 30, blueRectWidth, blueRectHeight);
  }
  public static void main(String[] args){
    AmericanFlag window = new AmericanFlag();
    window.repaint();
    System.out.println(0%1);
  }

}
