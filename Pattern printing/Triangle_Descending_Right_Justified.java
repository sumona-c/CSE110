import java.util.Scanner;
public class Triangle_Descending_Right_Justified{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=n;i>=1;i--){
      for(int k=n-i;k>=1;k--){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(j);
        }
      System.out.println();
    }
  }
}