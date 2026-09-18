import java.util.Scanner;
public class convStrIn2Pattern{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int h = sc.nextInt();
    String sL = "";
    int index = 0;
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch == ' ')
        continue;
      else
        sL += ch;
    }
    for(int i=1;i<=h;i++){
      for(int j=1;j<=h-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<2*i;j++){
        System.out.print(sL.charAt(index));
        index += 1;
        if(index == sL.length())
          break;
      }
      System.out.println();
    }
    if(sL.length()<=h*h)
      System.out.println("No character remains");
    else{
      String rem = "";
      for(int i=h*h;i<sL.length();i++){
        rem += sL.charAt(i);
      }
      System.out.println("Remaining Characters:"+rem);
    }
  }
}