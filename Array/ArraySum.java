import java.util.Scanner;
import java.util.Arrays;
public class ArraySum{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int [] arr1 = {10, 20, 30, 40, 50, 60, 70};
    int [] arr2 = {36, 25, 11, 87, 55};
    int n = 0;
    int length = 0;
    if(arr1.length < arr2.length){
      n = arr1.length;
      length = arr2.length;
      int [] ans = new int[length];
      for(int i = 0; i < n; i++){
        ans[i] = arr1[i] + arr2[i];
      }
      for(int i = n; i < length; i++){
        ans[i] = arr2[i];
      }
      System.out.println(Arrays.toString(ans));
    }
    else{
      n = arr2.length;
      length = arr1.length;
      int [] ans = new int[length];
      for(int i=0;i<n;i++){
        ans[i] = arr1[i] + arr2[i];
      }
      for(int i = n; i < length; i++){
        ans[i] = arr1[i];
      }
      System.out.println(Arrays.toString(ans));
    }
  }
}