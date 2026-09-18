//input:Fan Message: I think Madrid will score first but Bayern has a strong squad. It will be a close one! Hala MADRID!
//output:Madrid Supporter
//       Fan expect a close match
//Explanation Sample Case-1:
//In the message we can find Madrid twice and Bayern once, Therefore the fan is Madrid supporter. And there is the keyword close so the message shows Fan expects a close match
import java.util.Scanner;
public class string16{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String mad = "madrid";
    int ma = 0;
    String bay = "bayern";
    int ba = 0;
    String word = "";
    String key1 = "close";
    String key2 = "destroy";
    boolean close = false;
    boolean destroy = false;
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(ch == ' '||ch == '!'||ch == '.'){
        if(word.equalsIgnoreCase(key1))
          close = true;
        else if(word.equalsIgnoreCase(key2))
          destroy = true;
        if(word.equalsIgnoreCase(mad))
          ma++;
        else if(word.equalsIgnoreCase(bay))
          ba++;
        word = "";
      }
      else
        word += ch;
    }
    if(ma>ba){
      if(close)
        System.out.printf("Madrid Supporter\nFan expect a close match");
      else if(destroy)
        System.out.printf("Madrid Supporter\nFan expects a dominating victory!");
    }
    else if(ba>ma){
      if(close)
        System.out.printf("Bayern Supporter\nFan expect a close match");
      else if(destroy)
        System.out.printf("Bayern Supporter\nFan expects a dominating victory!");
    }
    else
      System.out.printf("Neutral\nHard to read the fan sentiment");
  }
}
