import java.util.Scanner;
public class cutString{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string:");
    String s = sc.nextLine();
    System.out.println("Enter number of character:");
    int num = sc.nextInt();
    if(num > s.length()){
      System.out.println("Number of characters cannot be larger than the String");
      return;
    }
    System.out.println("From the back? (true/false):");
    boolean fromTheBack = sc.nextBoolean();
    String ans = "";
    if(fromTheBack){
      for(int i = 0; i < s.length() - num; i++){
        ans += "" + s.charAt(i);
      }
    }
    else{
      for(int i = num; i < s.length(); i++){
        ans += "" + s.charAt(i);
      }
    }
    System.out.println(ans);
  }
}