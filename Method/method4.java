import java.util.Scanner;
public class method4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    evenChecker(num);
    boolean result1 = isEven(num);
    System.out.println(result1);
    boolean result2 = isPos(num);
    System.out.println(result2);
    sequence(num);
  }
//  checks if a number is even
  public static void evenChecker(int x){
    if(x % 2 == 0){
      System.out.println("Even!!");
    }
    else{System.out.println("Odd!!");
    }
  }
//  checks if a number is even and returns value in boolean
  public static boolean isEven(int x){
    return x % 2 == 0;
  }
//  checks if a number is positive and returns value in boolean
  public static boolean isPos(int x){
    return x >= 0;
  }
//  if n is positive then prints even numbers from 0 to n
//  if n is negetive then prints odd numbers from -1 to n
  public static void sequence(int x){
    if(isPos(x)){
      for(int i = 0;i <= x;i++){
        if(isEven(i)){
          System.out.print(i+" ");
        }
      }
    }
    else{
      for(int i = x;i < 0;i++){
        if(!isEven(i)){
          System.out.print(i+" ");
        }
      }
    }
  }
}
