import java.util.Scanner;
public class ArrayMaxMin{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size: ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter values: ");
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    int max = 0;
    int min = 0;
    for(int i = 0; i < arr.length; i++){
      if(i == 0){
        max = arr[i];
        min = arr[i];
      }
      if(max < arr[i]){
        max = arr[i];
      }
      if(min > arr[i]){
        min = arr[i];
      }
    }
    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
  }
}