import java.util.Scanner;
import java.util.Arrays;
public class NegetiveValue{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length:");
    int N = sc.nextInt();
    int [] arr = new int[N];
    int j = 0;
    System.out.println("Enter values:");
    while(j<N){
      int val = sc.nextInt();
      if(val<0){
        arr[j] = val;
        j++;
      }
    }
    System.out.println(Arrays.toString(arr));
    int sum = 0;
    for(int i=0;i<N;i++){
      sum += arr[i];
    }
    System.out.println("Sum: "+sum);
    double avg = (double)sum/N;
    System.out.println("Average: "+avg);
    
  }
}