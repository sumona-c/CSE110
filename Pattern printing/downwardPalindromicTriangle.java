import java.util.Scanner;
public class downwardPalindromicTriangle{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>=1;i--){
      for(int j=n-i;j>=1;j--){
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){
        System.out.print(k);
      }
      for(int k=i-1;k>=1;k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}