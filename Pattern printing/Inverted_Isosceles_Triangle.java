import java.util.Scanner;
public class Inverted_Isosceles_Triangle{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=2*(i-1);j++){
        System.out.print(" ");
      }
      for(int k=1;k<=2*(n-i)+1;k++){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}