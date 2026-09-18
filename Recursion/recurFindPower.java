public class recurFindPower{
  public static void main(String[]args){
    int a = 144;
    int b = 12;
    
    System.out.print(power(a, b));
  }
  public static int power(int x, int y){
    if(x == y){
      return 1;
    }
    return 1 + power(x / y, y);
  }
}