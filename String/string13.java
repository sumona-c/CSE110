//input: 2[h]5[o]1[p]
//output: hhooooop
import java.util.Scanner;
public class string13{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String temp = "";
    for(int i = 0; i < str.length(); i+=2){
      temp += "" + str.charAt(i);
    }
    String ans = "";
    for(int i = 1; i < temp.length(); i++){
      char ch1 = temp.charAt(i-1);
      char ch2 = temp.charAt(i);
      if(ch1 >= '0' && ch1 <= '9'){
        int num = ch1-'0';
        for(int j = 0; j < num; j++){
          ans += ch2;
        }
      }
    }
    System.out.print(ans);
  }
}