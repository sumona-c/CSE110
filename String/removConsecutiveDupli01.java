import java.util.Scanner;
public class removConsecutiveDupli01{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String ans = "";
    for(int i = 0; i < s1.length(); i++){
      char ch = s1.charAt(i);
      if(i < s1.length() - 1){
        if(ch == s1.charAt(i + 1)){
          continue;
        }
        else{
          ans += ch;
        }
      }
      else{
          ans += ch;
      }
    }
    System.out.print(ans);
  }
}