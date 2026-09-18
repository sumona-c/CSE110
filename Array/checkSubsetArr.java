import java.util.Scanner;
public class checkSubsetArr{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the length of the array 1:");
    int m = sc.nextInt();
    int [] arr1 = new int[m];
    System.out.println("Please enter the elements of the arr1:");
    for(int i = 0;i < m;i++){
      arr1[i] = sc.nextInt();
    }
    System.out.println("Please enter the length of the array 2:");
    int n = sc.nextInt();
    int [] arr2 = new int[n];
    System.out.println("Please enter the elements of the arr2:");
    for(int i = 0;i < n;i++){
      arr2[i] = sc.nextInt();
    }
    int count = 0;
    for(int i = 0;i < arr2.length; i++){
      for(int j = 0;j < arr1.length; j++){
        if(arr2[i] == arr1[j]){
          count++;
          break;
        }
      }
    }
    if(count == arr2.length){
      System.out.println("Array 2 is a subset of Array 1.");
    }
    else{
      System.out.println("Array 2 is not a subset of Array 1.");
    }
  }
}