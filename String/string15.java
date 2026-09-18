//length of the last word
import java.util.Scanner;
public class string15{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String word = "";
    for(int i=0;i<str.length();i++){
      char ch  = str.charAt(i);
      if(ch == ' ')
        word = "";
      else
        word += ch;
    }
    System.out.println(word.length());
  }
}