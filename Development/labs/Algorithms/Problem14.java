public class Problem14{
  public static int collatzTerms(int n){
    int numTerms = 1;
    int number = n;
    while(number != 1){

      if(number%2 == 0){
        number = number/2;
        numTerms ++;
      } else {
        number = 3*number + 1;
        numTerms ++;
      }
    }
    return numTerms;
  }
  public static void main(String[] args){
    int most = 10;
    for(int i = 1; i < 1000000; i+=2){
      if(collatzTerms(i) > most){
        most = collatzTerms(i);
        System.out.println(i + " " + most);
      }
    }
    System.out.println(most);
  }
}
