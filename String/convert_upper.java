import java.util.Scanner;
public class convert_upper{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String ans = "";
    for(int i=0;i<s1.length();i++){
      char ch = s1.charAt(i);
      if(ch >= 'a' && ch <= 'z'){
        ans += (char)(ch-32);
      }
      else{
        ans += ch;
      }
    }
    System.out.print(ans);
  }
}