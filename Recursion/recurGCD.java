public class recurGCD{
  public static void main(String[]args){
    int a = 625;
    int b = 25;
    System.out.print(gcd(a, b));
  }
  public static int gcd(int x, int y){
    if(y == 0){
      return x;
    }
    return gcd(y, x%y);
  }
}