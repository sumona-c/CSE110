import java.util.Scanner;
public class recurN{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    oneToN(1, N);
    nToOne(1, N);
    System.out.println(recursiveSum(1, N));
  }
  public static void oneToN(int i, int n){
    if(i > n){
      return;
    }
    else{
      System.out.println(i);
      oneToN(i + 1, n);
    }
  }
  public static void nToOne(int i, int n){
    if(n < i){
      return;
    }
    else{
      System.out.println(n);
      nToOne(i, n-1);
    }
  }
  public static int recursiveSum(int i, int n){
    if(i > n){
      return 0;
    }
    return i + recursiveSum(i + 1, n);
  }
}