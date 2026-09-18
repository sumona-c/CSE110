//input:"zaz"
/*output: Hurray! The mysterious traveler is going home!!
Explanation:
The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. 
So, the score of s would be |122 - 97| + |97 - 122|
 = 25 + 25 = 50.
Since 50 is divisible by 5, the traveler will return home safely.
*/
import java.util.Scanner;
public class string12{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int value = 0;
    int diff = 0;
    for(int i = 0; i < s.length() - 1; i++){
      diff = (int)s.charAt(i) - (int)s.charAt(i + 1);
      if(diff < 0){
        value += (-1) * diff;
      }
      else{
        value += diff;
      }
    }
    if(value % 5 == 0){
      System.out.println("Hurray! The mysterious traveler is going home!!");
    }
    else{
      System.out.println("Oh no!! The mysterious traveler will be stuck on the island!!");
    }
  }
}