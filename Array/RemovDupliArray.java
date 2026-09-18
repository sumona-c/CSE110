import java.util.Scanner;
import java.util.Arrays;
public class RemovDupliArray{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length: ");
    int N = sc.nextInt();
    System.out.println("Enter values: ");
    int [] arr = new int[N];
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for(int i = 0; i < arr.length; i++){
      boolean duplicate = false;
      for(int j = 0; j < i; j++){
        if(arr[i] == arr[j]){
          duplicate = true;
          break;
        }
      }
      if(!duplicate)
        count++;
    }
    int [] ans = new int[count];
    int index = 0;
    for(int i = 0; i < arr.length; i++){
      boolean duplicate = false;
      for(int j = 0; j < i; j++){
        if(arr[i] == arr[j]){
          duplicate = true;
          break;
        }
      }
      if(!duplicate){
        ans[index] = arr[i];
        index++;
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(ans));
  }
}