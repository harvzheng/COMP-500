/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon
{
  public FancyBalloon()
  {
    super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public FancyBalloon(int x, int y, int r, Color c)
  {
    super(x, y, r, c);
  }
  public void draw(Graphics g, boolean makeItFilled)
  {
    int x = getX();
    int y = getY();
    int r = getRadius();
    g.setColor(getColor());
    if (makeItFilled){
      g.fillOval(x-r/2, y, 2*r, r);
      g.fillOval(x, y-r/2, r, 2*r);
    } else {
      g.drawOval(x, y-r/2, r, 2*r);
      g.drawOval(x-r/2, y, 2*r, r);
    }
  }
}
