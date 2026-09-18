import java.util.Scanner;
public class palindrome{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      System.out.print(i);
    }
    for(int i=n-1;i>0;i--){
      System.out.print(i);
    }
  }
}