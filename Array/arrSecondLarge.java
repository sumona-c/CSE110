public class arrSecondLarge{
  public static void main(String[]abs){
    int [] arr = {10, 5, 32, 13, 70, 70, 32};
    secondLargest(arr);
  }
  public static void secondLargest(int [] a){
    for(int i = 0; i < a.length - 1; i++){
      for(int j = 0; j < a.length - i - 1; j++){
        if(a[j] > a[j + 1]){
          int temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
        }
      }
    }
    int secLar = 0;
    for(int i = a.length - 1; i > 0; i--){
      if(a[i - 1] < a[i]){
        secLar = a[i - 1];
        break;
      }
    }
    System.out.print(secLar);
  }
}