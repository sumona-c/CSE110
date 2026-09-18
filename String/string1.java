//input: Message: Class will start at 14:00. Room Number: 09B-10L
//output: 2-Digit PIN: 14
import java.util.Scanner;
public class string1{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String pin = "0";
    for(int i = 1;i < s.length(); i++){
      char ch1 = s.charAt(i-1);
      char ch2 = s.charAt(i);
      if((ch1 >='0' && ch1 <='9')&&(ch2 >='0' && ch2 <='9')){
        String temp = "" + ch1 + ch2;
      if(temp.compareTo(pin) > 0)
        pin = temp;
      }
    }
    System.out.println("2-Digit PIN: " + pin);
  }
}