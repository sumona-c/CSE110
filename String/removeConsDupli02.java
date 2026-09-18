import java.util.Scanner;
public class removeConsDupli02{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    for(int i = 0; i < s.length()-1; i++){
      char ch1 = s.charAt(i);
      for(int j = i + 1; j < i + 2; j++){
        if(ch1 ==s.charAt(j)){
          continue;
        }
        else{
          ans += s.charAt(i);
        }
      }
    }
    if(s.charAt(s.length()-2) != s.charAt(s.length()-1)){
      ans += s.charAt(s.length()-1);
    }
    System.out.println(ans);
  }
}