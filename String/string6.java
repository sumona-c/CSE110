//input: Flower
//       Flow
//output: Flow
import java.util.Scanner;
public class string6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String prefix = "";
    int minlength;
    if(s1.length() < s2.length()){
      minlength = s1.length();
    }
    else{
      minlength = s2.length();
    }
    for(int i = 0;i < minlength; i++){
      if(s1.charAt(i) == s2.charAt(i)){
        prefix += s1.charAt(i);
      }
      else{
        break;
      }
    }
    if(prefix.length() == 0){
      System.out.print("There is no common prefix between the input Strings.");
    }
    else{
      System.out.print(prefix);
    }
  }
}  