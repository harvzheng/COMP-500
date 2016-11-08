public class Electron extends Particle {

  public Electron( double px, double py, double vx, double vy ) {
    super(px, py, vx, vy);
    // set the mass...same for every Electron
    double c = 9.10938188d;
    setMass(c * Math.pow(10, -28));
  }
}
