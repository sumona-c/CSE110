import java.util.Scanner;
public class recurPrintReverseDigit{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    reverseDigits(n);
  }
  public static void reverseDigits(int a){
    if(a > 0){
      System.out.println(a % 10);
      reverseDigits(a / 10);
    }
  }
}