public class Problem4{
  public static boolean isPalindrome(int n) {
      int palindrome = n;
      int reverse = 0;

      while (palindrome != 0) {
          int remainder = palindrome % 10;
          reverse = reverse * 10 + remainder;
          palindrome = palindrome / 10;
      }
      if (n == reverse) {
          return true;
      }
      return false;
  }
  public static void main(String[] args){
      int largest = 0;
      for(int i = 0; i < 1000; i++){
        for(int j = 0; j < 1000; j++){
          if(isPalindrome(i * j) && i * j > largest){
            largest = i * j;
          }
        }
      }
      System.out.println(largest);
  }
}
