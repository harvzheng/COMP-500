public class test{
  public static boolean badIndentation(int maxLines){
    int lineCount = 3;
    while(lineCount < maxLines) {
      System.out.println (lineCount);
      lineCount++;
    }
    return true;
  }
  public static void main(String[] args){
    badIndentation(6);
  }
}
