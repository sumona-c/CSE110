import java.util.Arrays;
public class merge2array{
  public static void main(String[]args){
    int [] a1 = {10, 20, 30, 40, 50};
    int [] a2 = {60, 70, 80, 90, 100};
    int [] ans = new int[a1.length + a2.length];
    for(int i = 0; i < a1.length; i++){
      ans[i] = a1[i];
    }
    int a = a1.length;
    for(int i = 0; i < a2.length; i++){
      ans[a + i] = a2[i];
    }
    System.out.println(Arrays.toString(ans));
  }
}