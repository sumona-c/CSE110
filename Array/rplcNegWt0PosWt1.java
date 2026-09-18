import java.util.Scanner;
import java.util.Arrays;
public class rplcNegWt0PosWt1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length:");
    int N = sc.nextInt();
    int [] arr = new int[N];
    int [] mod = new int[N];
    System.out.println("Enter value:");
    for(int i = 0;i < N;i++){
      int value = sc.nextInt();
      arr[i] = value;
      if(value > 0){
        mod[i] = 1;
      }
      else{
        mod[i] = 0;
      }
    }
    System.out.println("Original Array:\n"+Arrays.toString(arr));
    System.out.println("After modifying:\n"+Arrays.toString(mod));
  }
}