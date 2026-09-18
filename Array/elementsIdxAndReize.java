import java.util.Scanner;
public class elementsIdxAndReize{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int[N];
    System.out.println("The elements of the array are:");
    for(int i = 0; i < arr.length; i++){
      System.out.println("Enter a number:");
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i < arr.length; i++){
      System.out.println(i + ": " + arr[i]);
    }
    int [] ans = new int[arr.length + 1];
    for(int i = 0; i < arr.length; i++){
      ans[i] = arr[i];
    }
    System.out.println("Enter another number:");
    ans[arr.length] =  sc.nextInt();
    System.out.println("After resizing the array:");
    for(int i = 0; i < ans.length; i++){
      System.out.print(ans[i] + " ");
    }
  }
}
    