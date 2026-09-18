import java.util.Scanner;
public class exchangCase{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String ans = "";
    for(int i=0;i<s1.length();i++){
      
      char ch = s1.charAt(i);
      int ascii = (int)ch;
      
      if(ascii>=97 && ascii<=122){
        
        int newAscii = ascii-32;
        char newCh = (char)newAscii;
        ans+=newCh;
      }
      
      else if(ascii>=65 && ascii<=90){
        
        int newAscii = ascii+32;
        char newCh = (char)newAscii;
        ans+=newCh;
      }
      else
        ans+=s1.charAt(i);
    }
    System.out.print(ans);
  }
}