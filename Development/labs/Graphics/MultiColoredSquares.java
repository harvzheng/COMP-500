import java.awt.*;
import javax.swing.*;
public class MultiColoredSquares extends JFrame{
  private static int side = 120;
  private static int margin = side / 5;
  private static int initX = margin;
  private static int initY = 20 + margin;
  private static int finalX = initX + side + margin;
  private static int finalY = initY + side + margin;
  private static int windowX = finalX + side + margin;
  private static int windowY = finalY + side + margin;

  public MultiColoredSquares(){
    setSize(windowX, windowY);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public void paint(Graphics g){
    g.setColor(Color.RED);
    g.fillRect(initX, initY, side, side);
    g.setColor(Color.BLUE);
    g.fillRect(finalX, initY, side, side);
    g.setColor(Color.GREEN);
    g.fillRect(initX, finalY, side, side);
    g.setColor(Color.YELLOW);
    g.fillRect(finalX, finalY, side, side);
  }
  public static void main(String[] args){
    MultiColoredSquares window = new MultiColoredSquares();
    window.repaint();
  }
}
