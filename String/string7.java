//input: 9Abe-Coal-69UK-420i
//output: 9abE-COAl-69uK-420I
import java.util.Scanner;
public class string7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      if(ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
        ans += (char)(ch+32);
      }
      else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        ans += (char)(ch-32);
      }
      else{
        ans += ch;
      }
    }
    System.out.print(ans);
  }
}
      