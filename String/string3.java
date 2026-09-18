//input: ^3bm@_hr_bnlhmf
//output: vecna is coming
import java.util.Scanner;
public class string3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      if(ch >='a' && ch <'z')
        ans += (char)(ch+1);
      else if(ch == 'z')
        ans += 'a';
      else if(ch =='^')
        ans += 'v';
      else if(ch == '3')
        ans += 'e';
      else if(ch == '@')
        ans += 'a';
      else if(ch == '_')
        ans += ' ';
    }
    System.out.println(ans);
  }
}