public class ComplexPoint{
  private double real, imaginary;

  public ComplexPoint(double r, double i){
    real = r;
    imaginary = i;
  }
  public double getReal(){
    return real;
  }
  public double getImaginary (){
    return imaginary;
  }
  public ComplexPoint square(){
    double tempR = real;
    double r  = real*real - imaginary * imaginary;
    double i = 2 * tempR * imaginary;
    ComplexPoint n = new ComplexPoint(r, i);
    return n;
  }
  public ComplexPoint add(ComplexPoint p){
    double newReal = real + p.getReal();
    double newImaginary = imaginary + p.getImaginary();
    ComplexPoint d = new ComplexPoint(newReal, newImaginary);
    return d;
  }
  public boolean isWithinRadius(double r){
    if(real * real + imaginary * imaginary > r * r){
      return false;
    }
    return true;
  }
  public static boolean isStable(){
    int n = 3000;
    ComplexPoint original = new ComplexPoint(this.real, this.imaginary);
    ComplexPoint copy = original;
    int counter = 0;
    while(copy.isWithinRadius(2)){
      if(counter < n){
        copy = copy.square().add(original);
        counter ++;
      } else{
        return true;
      }
    }
    return false;
  }
}
