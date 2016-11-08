public class Problem3{
  public static void main(String[] args){
    // int n = 322;
    long n = 600851475143L;
    int count = 2;
    while(count != n){
      if(n%count == 0){
        n = n/count;
      } else{
        count ++;
      }
    }
    System.out.println(count);

  }
}
