public class method6{
  public static void main(String[]args){
    boolean result = isTriangle(3, 4, 5);
    System.out.println(result);
    triArea(3, 4, 5);
  }
//  checks if 3 sides can form a triangle
  public static boolean isTriangle(int a, int b, int c){
    return (a + b > c)&&(b + c > a)&&(c + a > b);
  }
//  if isTriangle == true, then calculates the area of the triangle
  public static void triArea(int x, int y, int z){
    if(isTriangle(x, y, z)){
      int s = (x + y + z)/2;
      double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
      System.out.printf("%.3f\n",area);
    }
    else{
      System.out.println("Can’t form triangle");
    }
  }
}

