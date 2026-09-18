public class method7{
  public static void main(String[]args){
    String s = "I woke up at 9 pm";
    longestWord(s);
  }
  public static void longestWord(String a){
    String word  = "";
    String temp = "";
    for(int  i = 0; i < a.length(); i++){
      char ch = a.charAt(i);
      if(ch == ' '){
        if(temp.length() > word.length()){
          word = temp;
        }
        temp = "";
      }
      else{
        temp += ch;
      }
      if(i == a.length() - 1){
        if(temp.length() > word.length()){
          word = temp;
        }
        temp = "";
      }
    } 
    System.out.print(word);
  }
}