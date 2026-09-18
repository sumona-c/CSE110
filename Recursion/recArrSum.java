public class recArrSum{
  public static void main(String[]args){
    int [] arr = {10, 60, 20, 80, 50};
    System.out.print(arraySum(arr, 0));
  }
  public static int arraySum(int [] a, int idx){
    if(idx == a.length){
      return 0;
    }
    return a[idx] + arraySum(a, idx+1);
  }
}