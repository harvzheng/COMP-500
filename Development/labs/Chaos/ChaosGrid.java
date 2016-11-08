// Gustav, Harvey, Michelle
import java.util.Scanner;
public class ChaosGrid{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double minX, minY, maxX, maxY, stepSize, counter, tempX, tempY;

    System.out.print("minX? ");
    minX = keyboard.nextDouble();
    System.out.print("minY? ");
    minY = keyboard.nextDouble();
    System.out.print("maxX? ");
    maxX = keyboard.nextDouble();
    System.out.print("maxY? ");
    maxY = keyboard.nextDouble();
    System.out.print("stepSize? ");
    stepSize = keyboard.nextDouble();

    for(tempX = minX; tempX < maxX; tempX += stepSize){
      for(tempY = minY; tempY < maxY; tempY += stepSize){
        System.out.println("(" + tempX + ", "+ tempY + ") ");
        System.out.println(Chaos.chaos(tempX, tempY));
      }
    }
  }
}
