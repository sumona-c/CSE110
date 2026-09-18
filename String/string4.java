//input: Codingggg-is-funnnn
//output: The words are:
//        Coding
//        is
//        fun
import java.util.Scanner;
public class string4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    System.out.println("The words are: ");
    for(int k = 0; k < s.length(); k++){
      char ch = s.charAt(k);
      if(ch >='a' && ch <='z' || ch >='A' && ch <='Z'){
        ans += ch;
        if(k == s.length()-1){
          String in_ans = "";
          for(int i = 0; i < ans.length(); i++){
            char ans_ch = ans.charAt(i);
            boolean found = false;
            for(int j = 0; j < in_ans.length();j++){
              if(ans_ch == in_ans.charAt(j))
                found = true;
            }
            if(!found)
              in_ans += ans_ch;
          }
          System.out.println(in_ans);
          ans = "";
        }
      }
      else{
        String in_ans = "";
        for(int i = 0;i < ans.length(); i++){
          char ans_ch = ans.charAt(i);
          boolean found = false;
          for(int j = 0;j < in_ans.length(); j++){
            if(ans_ch == in_ans.charAt(j))
              found = true;
          }
          if(!found)
            in_ans += ans_ch;
        }
        System.out.println(in_ans);
        ans = "";
      }
    }
  }
}