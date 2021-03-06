// Chapter 2 Question 15 (a)

/**
 * This program displays a red cross on a white
 * background.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RedCross extends JPanel{
  public void paintComponent(Graphics g){
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int lengthOne = 10;
    int lengthTwo = 50;
    int verticalX = xCenter - lengthTwo/4 - lengthOne;
    int horizontalY = yCenter - lengthTwo/4 - lengthOne;

    g.setColor(Color.RED);
    g.fillRect(xCenter, horizontalY, lengthOne, lengthTwo);
    g.fillRect(verticalX, yCenter, lengthTwo, lengthOne);
  }

  public static void main(String[] args){
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}
