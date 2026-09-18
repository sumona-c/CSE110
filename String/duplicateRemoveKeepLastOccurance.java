import java.util.Scanner;
public class duplicateRemoveKeepLastOccurance{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String ans = "";
    for(int i=0;i<s1.length();i++){
      char ch = s1.charAt(i);
      int index = i;
      for(int j=i+1;j<s1.length();j++){
        if(ch == s1.charAt(j))
          index = j;
      }
      if(index == i)
        ans += s1.charAt(index);
    }
    System.out.print(ans);
  }
}