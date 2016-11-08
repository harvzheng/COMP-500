public class Particle {
  private double positionX, positionY;
  private double velocityX, velocityY;
  private double mass;

  public Particle( double px, double py, double vx, double vy ) {
    positionX = px;
    positionY = py;
    velocityX = vx;
    velocityY = vy;
  }

  public double getMass() {
    return mass;
  }

  public void setMass( double mass ) {
    this.mass = mass;
  }

  public static void main(String[] args){
    Particle e = new Electron(0.0, 0.0, 0.0, 1.0);
    System.out.println(e.getMass());
  }
}
