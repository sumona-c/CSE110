import java.util.Scanner;
public class method1{
  public static void main(String[]args){
    boolean checkA = isPrime(15);
    System.out.println(checkA);
    boolean checkB = isPerfect(6);
    System.out.println(checkB);
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int result = special_sum(x);
    System.out.println(result);
  }
//  checks if a number is prime or not
  public static boolean isPrime(int a){
    int count = 0;
    for(int i = 1; i <= a; i++){
      if(a % i == 0){
        count++;
      }
    }
      return count == 2;
  }
//  checks if a number is perfect or not
  public static boolean isPerfect(int a){
    int sum = 0;
    for(int i = 1; i < a; i++){
      if(a % i == 0){
        sum += i;
      }
    }
    return sum == a;
  }
//  includes the number in sum only if it is prime or perfect
  public static int special_sum(int a){
    int sum = 0;
    for(int i = 1; i <= a; i++){
      if(isPerfect(i) || isPrime(i)){
        sum += i;
      }
    }
    return sum;
  }
}