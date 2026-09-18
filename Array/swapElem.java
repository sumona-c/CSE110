import java.util.Arrays;
public class swapElem{
  public static void main(String[]args){
    int [] arr = {10, 20, 30, 40, 50};
    int first = arr[0];
    int last = arr[arr.length - 1];
    for(int i = 0; i < arr.length; i++){
      if(i == 0){
        arr[i] = last;
      }
      if(i == (arr.length - 1)){
        arr[i] = first;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}