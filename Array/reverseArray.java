import java.util.Scanner;
public class reverseArray{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int N = sc.nextInt();
    int [] arr = new int[N];
    for(int i = 0; i < arr.length; i++){
      System.out.println("Enter a number:");
      arr[i] = sc.nextInt();
    }
    int [] ans = new int[N];
    for(int i = 0; i < ans.length; i++){
      ans[i] = arr[ans.length-i-1];
    }
    System.out.println("Reversed using a new array:");
    for(int i = 0; i < ans.length; i++){
      System.out.print(ans[i] + " ");
    }
    for(int i = 0; i < arr.length / 2;i++){
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    System.out.println();
    System.out.println("Reversed the original array:");
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}