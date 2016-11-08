import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChaosGraphics extends JFrame{
  public int minX = 0;
  public int minY = 0;
  // public int maxX = 600;
  // public int maxY = 600;
  public static final int WINDOW = 1000;
  public double r;
  public double i;
  public double zoomFactor = 2;

  public ChaosGraphics(){
    setSize(WINDOW, WINDOW);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public void paint(Graphics g){
    for(int x = 0; x < WINDOW; x++){
      r = ((double)x-WINDOW/2)/(WINDOW/2) * zoomFactor;
      for(int y = 0; y < WINDOW; y++){
        i = ((double)y-WINDOW/2)/(WINDOW/2) * zoomFactor;
        if(Chaos.chaos(r, i)){
          g.setColor(Color.BLACK);
          g.fillRect((int)x, (int)y, 1, 1);
        } else {
          int iterations = Chaos.numIterations(r, i);
          // Color randColor = new Color(255 - iterations/10 , 0, 0);
          g.setColor(Color.WHITE);
          g.fillRect(x, y, 1, 1);
        }
      }
    }
  }
  public static void main(String[] args){
    ChaosGraphics test = new ChaosGraphics();
    test.repaint();
  }
}
