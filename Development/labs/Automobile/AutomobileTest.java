public class AutomobileTest{
  public static void main(String[] args){
    Automobile boat = new Automobile();
    Automobile car = new Automobile(2011, "Audi");
    System.out.println(boat.getYear() + " " + boat.getMake());
    System.out.println(car.getYear() + " " + car.getMake());
  }
}
