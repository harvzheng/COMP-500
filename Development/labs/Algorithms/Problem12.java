public class Problem12{
  public static int numFactors(long n){
    int numFactors = 0;
    for(int i = 1; i * i < n; i++){
      if(i*i == n){
        numFactors ++;
      } else if(n%i == 0){
        numFactors += 2;
      }
    }
    return numFactors;
  }
  public static void main(String[] args){
    long tNum = 0;
    boolean exit = false;
    int numFactors = 0;
    int counter = 1;
    while(!exit){
      tNum += counter;
      numFactors = numFactors(tNum);
      if(numFactors > 500){
        exit = true;
      }
      counter ++;
    }
    System.out.println(tNum);
  }
}
