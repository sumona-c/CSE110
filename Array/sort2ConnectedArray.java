import java.util.Arrays;
public class sort2ConnectedArray{
  public static void main(String[]args){
    //int [] marks = {85, 90, 75, 44, 99};
    //String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    int [] marks = {100, 47, 85, 94, 5, 50};
    String [] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};

    for(int i = 0;i < marks.length-1;i++){
      for(int j = 0;j < marks.length-i-1;j++){
        if(marks[j] > marks[j + 1]){
          int temp_marks = marks[j];
          marks[j] = marks[j + 1];
          marks[j + 1] = temp_marks;
          String temp_names = names[j];
          names[j] = names [j + 1];
          names[j + 1] = temp_names;
        }
      }
    }
    System.out.println("Sorted Array:\n"+Arrays.toString(marks)+"\n"+Arrays.toString(names));
  }
}