//input: Expelliarmus
//       Accio
//       Lumos
//       Expecto Patronum
//       Avada Kedavra
//output:You Lost
import java.util.Scanner;
public class string11{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int doom = 100;
    for(int i = 0; i < 5; i++){
      String s = sc.nextLine();
      int ascii = 0;
      for(int j = 0; j < s.length(); j++){
        ascii += (int)s.charAt(j);
      }
      if(s.length() < 3){
        doom += 10;
        if(ascii % 3 == 0){
          doom += 10;
        }
      }
      else if(ascii % 2 == 0){
        doom += 25;
        if(ascii % 3 == 0){
          doom += 10;
        }
      }
      else if(ascii % 2 != 0){
        doom -= 50;
        if(ascii % 3 == 0){
          doom += 10;
        }
      }
      if(doom > 200){
        doom = 200;
      }
    }
    if(doom <= 0){
      System.out.println("You won");
    }
    else{
      System.out.println("You Lost");
    }
  }
}