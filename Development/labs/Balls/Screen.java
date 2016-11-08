/**  * This program displays a ball that bounces off the walls of the screen.  * It requires the use of `Ball.java`.  */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

public class Screen extends JPanel implements ActionListener {

    private Ball redBall;
    private Ball blueBall;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final double GRAVITY = 9.81;

    public Screen(int width, int height) {
        redBall =  Ball.randomBall( Color.red );
        blueBall = Ball.randomBall( Color.BLUE);
    }

    // Called automatically after a repaint request
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Paint the background
        redBall.paint(g);
        blueBall.paint(g);
    }

    // Called automatically when the timer fires
    public void actionPerformed(ActionEvent e) {         // The width and height parameters here are that of the Frame
        redBall.update();
        blueBall.update();
        repaint();
    }

    public static void main(String[] args) {
        // create a new window to contain this animation
        JFrame window = new JFrame("Action Canvas");
        // Set this window's location and size:         // upper-left corner at 300, 300
        window.setBounds(50, 50, WIDTH, HEIGHT);

        // Crate a Screen object and add it to the window:
        Screen screen = new Screen(WIDTH, HEIGHT);
        Container c = window.getContentPane();
        c.add(screen);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        // Create a Timer object that fires every 30 milliseconds;
        // attach it to panel so that panel "listens to" and
        // processes the timer events; start the timer:
        Timer clock = new Timer(30, screen);
        clock.start();
    }
}
