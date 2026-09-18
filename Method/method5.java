import java.util.Scanner;
public class method5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double area = circleArea(a);
    System.out.printf("%.4f\n",area);
    double b = sc.nextDouble();
    double volume = sphereVolume(b);
    System.out.printf("%.4f\n",volume);
    findSpace(10, "circle");
    findSpace(5,"sphere");
    findSpace(10,"square");
  }
//  area of circle in integer
  public static double circleArea(int r){
    double area = 3.1416 * r * r;
    return area;
  }
//  volume of sphere in double
  public static double sphereVolume(double r){
    double volume = (3.1416 * r * r * r)*4/3;
    return volume;
  }
//  find space of the given shape
  public static void findSpace(int diameter, String shape){
    double radius= diameter / 2.0;
    if(shape.equals("circle")){
      System.out.printf("%.4f\n",circleArea((int)radius));
    }
    else if(shape.equals("sphere")){
      System.out.printf("%.4f\n",sphereVolume(radius));
    }
    else{
      System.out.println("Wrong Parameter");
    }
  }
}
