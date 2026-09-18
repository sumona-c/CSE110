import java.util.Arrays;
public class BubbleSortDescending{
  public static void main(String[]args){
    int [] arr = {23, 46, 93, 11, 75};
    for(int i = 0;i < arr.length - 1;i++){
      for(int j = 0;j < arr.length-i-1;j++){
        if(arr[j] < arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("Sorted Array in Descending order:");
    System.out.println(Arrays.toString(arr));
  }
}