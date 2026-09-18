public class arrShiftToLeftByOne{
  public static void main(String[]abs){
    int [] arr = {10, 5, 32, 13, 70, 70, 32};
    shiftLeft(arr);
  }
  public static void shiftLeft(int [] a){
    int temp = 0;
    for(int i = 0; i < a.length ; i++){
      if(i == 0){
        temp = a[i];
      }
      else{
        a[i - 1] = a[i];
      }
      if(i == a.length - 1){
        a[i] = temp;
      }
    }
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
  }
}
    
      