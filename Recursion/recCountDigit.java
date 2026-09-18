public class recCountDigit{
  public static void main(String[]args){
    int a = 9999;
    System.out.print(count(a));
  }
  public static int count(int n){
    if(n / 10 == 0){
      return 1;
    }
    return 1 + count(n / 10);
  }
}