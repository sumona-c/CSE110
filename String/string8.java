//input: CSE110 is easy
//output: easy is CSE110
import java.util.Scanner;
public class string8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    String temp = "";
    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      if(ch == ' '){
        ans = temp + ch + ans;
        temp = "";
      }
      else{
        temp += ch;
      }
      if(i == s.length()- 1){
        ans = temp + " " + ans;
        temp = "";
      }
    }
    System.out.println(ans);
  }
}