import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

public class Ball {

	// fields

	private static final int RADIUS = 10;
	private static final double MIN_VELOCITY = 5.0;
	private static final double MAX_VELOCITY = 15.0;

	/* An object of class 'Random' is used for generating random
	   numbers.  We will use it in our factory method. */
	public static Random rand = new Random();

	private double dx, dy;
	private double cx, cy;
	private Color color;

	// constructors

	public Ball( double cx, double cy, double dx, double dy, Color color ) {
		this.cx = cx;
		this.cy = cy;
		this.dx = dx;
		this.dy = dy;
		this.color = color;
	}

	// static methods

	/* This is called a 'factory' method.  It's a static method that
	   returns an instance of an object, usually of a particular kind. */
	public static Ball randomBall( Color color ) {
		// set position based on Screen size
		double cx = rand.nextDouble() * Screen.WIDTH;
		double cy = rand.nextDouble() * Screen.HEIGHT;
		// set velocity in a random direction, with x and y components
		double v = rand.nextDouble() * (MAX_VELOCITY - MIN_VELOCITY) + MIN_VELOCITY;
		double direction = rand.nextDouble() * 2.0 * Math.PI;
		double dx = Math.cos(direction) * v;
		double dy = Math.sin(direction) * v;
		Ball newBall = new Ball( cx, cy, dx, dy, color );
		return newBall;
	}

	// instance methods

	/* The move() method should get called every time step */
	public void update() {
		// change position (x & y) by velocity (x & y)

		// YOUR CODE HERE
    cx += dx;
    cy += dy;
    dy += Screen.GRAVITY;
		// if the ball hits the edge of the box, change direction

		// YOUR CODE HERE
    // if(cx + 2*RADIUS > Screen.WIDTH || cx - RADIUS < 0){
    //   dx = -dx;
    // }
    // if(cy + 3*RADIUS  > Screen.HEIGHT || cy - RADIUS < 0){
    //   dy = -dy;
    // }

    if(cy > Screen.HEIGHT){
    }
	}

	public void paint( Graphics g ) {
		// paint the ball using g

		// YOUR CODE HERE
    g.setColor(color);
    g.fillOval((int)cx-RADIUS, (int)cy - RADIUS, 2 *RADIUS, 2 *RADIUS);
	}
}
