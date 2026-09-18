public class recurReverseStr{
  public static void main(String[]args){
    System.out.println(reverse_string("swan", 0));
  }
  public static String reverse_string(String s, int i){
    if(i < s.length()){
      return s.charAt(s.length()- i - 1) + reverse_string( s, i + 1);
    }
    return "";
  }
}