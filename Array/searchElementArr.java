import java.util.Scanner;
public class searchElementArr{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N:");
    int N = sc.nextInt();
    int [] arr = new int[N];
    for(int i = 0;i < N;i++){
      System.out.println("Enter a number:");
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the number you want to find:");
    int find = sc.nextInt();
    int index = 0;
    boolean found = false;
    for(int i = 0;i < arr.length;i++){
      if(find == arr[i]){
        index = i;
        found = true;
        break;
      }
    }
    if(found){
      System.out.println(find+" is at index "+index);
    }
    else{
      System.out.println("Element not found");
    }
  }
}