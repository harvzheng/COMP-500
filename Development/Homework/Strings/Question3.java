public class Question3{
  public static String removeDashes(String s){
    String s2 = s.replace("-", "");
    return s2;
  }
  public static void main(String[] args){
    System.out.println(removeDashes("987-65-4321"));
  }
}
