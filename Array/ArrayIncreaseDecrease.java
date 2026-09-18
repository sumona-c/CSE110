import java.util.Scanner;
import java.util.Arrays;
public class ArrayIncreaseDecrease{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int [] arr = {90, 80, 70, 60, 50};
  int [] ans1 = new int[arr.length-n];
  int [] ans2 = new int[arr.length+n];
  for(int i=0;i<ans1.length;i++){
    ans1[i] = arr[i];
  }
  for(int i=0;i<arr.length;i++){
    ans2[i] = arr[i];
  }
  for(int i=arr.length;i<ans2.length;i++){
    ans2[i] = sc.nextInt();
  }
  System.out.println(Arrays.toString(arr));
  System.out.println(Arrays.toString(ans1));
  System.out.println(Arrays.toString(ans2));
  }
}