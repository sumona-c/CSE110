import java.util.Scanner;
public class palindromicTriangle{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int k=1;k<=n;k++){
      for(int j=1;j<=n-k;j++){
        System.out.print(" ");
      }
      for(int i=1;i<=k;i++){
        System.out.print(i);
      }
      for(int i=k-1;i>=1;i--){
        System.out.print(i);
      }
      System.out.println();
    }
  }
}