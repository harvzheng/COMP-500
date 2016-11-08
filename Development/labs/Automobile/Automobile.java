public class Automobile{
  private int year;
  private String make;

  public int getYear(){
    return year;
  }

  public static int getStaticYear(){
    return 0;
  }

  public String getMake(){
    return make;
  }
  public Automobile(){
    year = 1998;
    make = "Toyota";
  }
  public Automobile(int y, String m){
    year = y;
    make = m;
  }
}
