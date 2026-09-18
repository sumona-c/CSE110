//input: me+et-me-#after#clas+.
//output: meeet me
//        after
//        class
import java.util.Scanner;
public class string10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      if(ch == '+'){
        if(i == 0){
          continue;
        }
        ans += ""+ s.charAt(i - 1);
      }
      else if(ch == '-'){
        ans += " ";
      }
      else if(ch == '%'){
        if(i == s.length() - 1){
          continue;
        }
        for(int j = 0; j < 3; j++){
          ans += "" + s.charAt(i + 1);
        }
      }
      else if(ch == '.'){
        break;
      }
      else if(ch == '#'){
        System.out.println(ans);
        ans = "";
      }
      else{
        ans += ch;
      }
    }
    System.out.println(ans);
  }
}