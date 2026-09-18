import java.util.Scanner;
import java.util.Arrays;
public class ArraysOddNumSum{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length:");
    int N = sc.nextInt();
    int [] arr = new int[N];
    int sum = 0;
    int count  = 0;
    for(int i=0;i<N;i++){
      arr[i] = sc.nextInt();
      if(arr[i]%2!=0){
        sum += arr[i];
        count++;
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Sum: "+sum);
    double avg = (double)sum/count;
    System.out.println("Average: "+avg);
  }
}