import java.util.Scanner;
public class replace_Char{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();
  String s2 = sc.nextLine();
  String s3 = sc.nextLine();
  String ans = "";
  for(int i = 0; i < s1.length(); i++){
    String temp = "" + s1.charAt(i);
    if(s2.equals(temp)){
      ans += s3;
    }
    else{
      ans += s1.charAt(i);
    }
  }
  System.out.print(ans);
  }
}
    