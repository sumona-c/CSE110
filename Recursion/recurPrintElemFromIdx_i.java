import java.util.Scanner;
public class recurPrintElemFromIdx_i{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int [] arr = {13, 12, 19, 21, 31, 55};
    System.out.println("Index:");
    int index = sc.nextInt();
    print_element(arr, index);
  }
  public static void print_element(int [] a, int idx){
    if(idx == a.length){
      return;
    }
    System.out.println(a[idx]);
    print_element(a, idx + 1);
  }
}