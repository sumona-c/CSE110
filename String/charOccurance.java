import java.util.Scanner;
public class charOccurance{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    boolean found = false;
    int occurance = 0;
    for(int i=0;i<s1.length();i++){
      String temp = ""+s1.charAt(i);
      if(s2.equals(temp)){
        found = true;
        occurance++;
      }
    }
    if(found){
      System.out.printf("Found\nOcuurance: %d",occurance);
    }
    else
      System.out.print("Not Found");
  }
}