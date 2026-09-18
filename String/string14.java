/*
Input:Message: secret
      Key: agent
output:sagecrenett
Explanation: Merging alternately:'s' (from message) 
+ 'a' (from key) + 'e' (message) + 'g' (key) + 'c' (message) 
+ 'e' (key) + 'r' (message) + 'n' (key) + 'e' (message) 
+ 't' (key) + 't' (message remaining).
*/
import java.util.Scanner;
public class string14{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String message = sc.nextLine();
    String key = sc.nextLine();
    String ans = "";
    int length;
    if(message.length() < key.length()){
      length = message.length();
    }
    else{
      length = key.length();
    }
    for(int i = 0; i < length; i++){
      ans += "" + message.charAt(i) + key.charAt(i);
    }
    if(message.length() < key.length()){
      for(int i = length; i < key.length(); i++){
        ans += (char)key.charAt(i);
      }
    }
    else{
      for(int i = length; i < message.length(); i++){
        ans += (char)message.charAt(i);
      }
    }
    System.out.print(ans);
  }
}