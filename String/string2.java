//input: “55”
//output: D
public class string2{
  public static void main(String[]args){
    String str = "101";
    int num = 0;
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      num = num * 10 + (ch - '0');
    }
    if(num >= 90 && num <= 100){
      System.out.println("A");
    }
    else if(num >= 80 && num <= 89){
      System.out.println("A-");
    }
    else if(num >= 70 && num <= 79){
      System.out.println("B");
    }
    else if(num >= 60 && num <= 69){
      System.out.println("C");
    }
    else if(num >= 50 && num <= 59){
      System.out.println("D");
    }
    else if(num < 50){
      System.out.println("F");
    }
    else{
      System.out.println("Invalid Mark");
    }
  }
}