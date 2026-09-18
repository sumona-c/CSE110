//Find the longest spell name whispered and If two spell names are the same length, choose the first one whispered. Also, calculate the power level of the spell as the sum of ASCII values of its letters.
//stop taking input at "stop"
import java.util.Scanner;
public class string17{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Names of the spells: ");
    String stop = "stop";
    String spell = "";
    int powerlevel = 0;
    for(int i = 1; i > 0;i++){
      String s = sc.nextLine();
      String temp = "";
      if(s.equals(stop))
        break;
      else{
        for(int j = 0; j < s.length(); j++){
          char ch = s.charAt(j);
          if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))
            temp += ch;
        }
        if(temp.length() > spell.length())
          spell = temp;
      }
    }
    spell = spell.toUpperCase();
    for(int i = 0; i < spell.length(); i++){
      powerlevel += (int)(spell.charAt(i));
    } 
    System.out.println("Largest spell: " + spell);
    System.out.println("Power Level: " + powerlevel);
  }
}