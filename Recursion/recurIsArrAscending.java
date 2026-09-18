public class recurIsArrAscending{
  public static void main(String[]args){
    int [] arr = {10, 15, 20, 40, 50};
    System.out.print(isAscending(arr, 0));
  }
  public static boolean isAscending(int [] a, int idx){
    boolean yes = true;
    if(idx + 1 == a.length){
      return true;
    }
    if(a[idx] > a[idx + 1]){
      return false;
    }
    return isAscending(a, idx+1);
  }
}