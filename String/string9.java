//input: StrongPass123!
//output: True
import java.util.Scanner;
public class string9{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    boolean upper = false;
    boolean lower = false;
    boolean special = false;
    boolean digit = false;
    for(int i = 0; i< s.length(); i++){
      char ch = s.charAt(i);
      if(ch >= 'A' && ch <= 'Z'){
        upper = true;
      }
      else if(ch >= 'a' && ch <= 'z'){
        lower = true;
      }
      else if(ch >= '0' && ch <= '9'){
        digit = true;
      }
      else{
        special = true;
      }
    }
    if(upper && lower && digit && special){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
}