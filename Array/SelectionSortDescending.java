import java.util.Arrays;
public class SelectionSortDescending{
  public static void main(String[]args){
    int [] arr = {23, 46, 93, 11, 75};
    for(int i = 0;i < arr.length-1;i++){
      int max_index = i;
      for(int j = i + 1;j < arr.length;j++){
        if(arr[j] > arr[max_index]){
          max_index = j;
        }
      }
      int temp = arr[max_index];
      arr[max_index] = arr[i];
      arr[i] = temp;
    }
    System.out.println("Sorted Array in Descending Order:");
    System.out.println(Arrays.toString(arr));
  }
}