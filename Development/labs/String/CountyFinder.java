import java.io.*;
import java.util.Scanner;

public class CountyFinder {
  public static void main( String args[] ) {
    String fileName = "us-counties-by-name.csv";
    File file = new File(fileName);
    Scanner fileReader = null;
    try {
      fileReader = new Scanner(file);
    } catch (FileNotFoundException ex) {
      System.out.println( "Cannot open file '" + fileName + "'.");
      System.exit(1);
    }
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Input a state: ");
    String state = keyboard.nextLine();
    int numCounties = 0;
    int totalPop = 0;

    while( fileReader.hasNext() ) {
      String s = fileReader.nextLine();
      if(s.indexOf(state, s.indexOf(",", s.indexOf(",") + 1) + 1)!= -1){ //this could just be s.indexOf(state), but this checks after the county name for the state name, which prevents Colorado County from slipping into
        int firstCommaPos = s.indexOf(",") + 1;
        int secondCommaPos = s.indexOf(",", firstCommaPos + 1);
        int lastCommaPos = s.lastIndexOf(",") +1;
        int population = Integer.parseInt(s.substring(lastCommaPos));
        String countyName = s.substring(firstCommaPos, secondCommaPos);
        System.out.println(countyName);
        totalPop += population;
        numCounties ++;
      }
    }
    System.out.println("Number of counties in " + state + " is " + numCounties);
    System.out.println("Total populations of all counties in " + state + " combined is: " + totalPop);
  }
}
