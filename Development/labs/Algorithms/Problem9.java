public class Problem9{
  public static void main(String[] args){
    int a, b, c;
    int largestA = 0;
    int largestB = 0;
    int largestC = 0;
    for(int m = 1; m < 1000; m++){
      for(int n = 1; n < 1000; n++){
        if(m > n){
          a = m*m - n*n;
          b = 2 * m * n;
          c = m*m + n*n;
          if(a + b + c == 1000){
            largestA = a;
            largestB = b;
            largestC = c;
          }
        }
      }
    }

    System.out.println(largestA + " * " + largestB + " * " + largestC + " = " + largestA * largestB * largestC);
  }
}
