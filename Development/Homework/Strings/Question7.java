public class Question7{
  public static String convertName(String s){
    int commaIndex = s.indexOf(",");
    String last = s.substring(0, commaIndex);
    String first = s.substring(commaIndex + 1);
    String firstLast = first.trim() + " "+last.trim();
    return firstLast;
  }
  public static void main(String[] args){
    System.out.println(convertName("Freeman, Morgan"));
  }
}
