/* by Sean DongWoo Kim, Jacob Golas, Michelle Jeon, Harvey Zheng, Kevin Milkowski */
public class Problem6{
  public static void main(String[] args){
    int sumOfSquares = 0;
    int sumOfNums = 0;
    for(int i = 1; i <= 100; i++){
      sumOfSquares += i * i;
      sumOfNums += i;
    }
    System.out.println( sumOfNums * sumOfNums - sumOfSquares);
  }
}
