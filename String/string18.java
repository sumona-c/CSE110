//input: Brac University
//output: Bric enivUrsaty
//reverse the order of the vowels
import java.util.Scanner;
public class string18{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String vowel = "";
    String ans = "";
    int index = 0;
    for(int i = 0; i < s.length(); i++){
      char ch1 = s.charAt(i);
      if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
        vowel += ch1;
    }
    index = vowel.length()-1;
        for(int i = 0; i < s.length(); i++){
          char ch2 = s.charAt(i);
          if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'||ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'){
            ans += vowel.charAt(index);
            index--;
          }
          else
            ans += ch2;
        }
        System.out.println(ans);
  }
}