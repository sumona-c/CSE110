public class string31{
  public static void main (String[]args){
    String str = "   56hdf j cddk   ";
    trim(str);
  }
  public static void trim(String s){
    String ans = "";
    int start = 0;
    int end = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) != ' '){
        start = i;
        break;
      }
    }
    for(int i = s.length()-1; i > -1 ; i--){
      if(s.charAt(i) != ' '){
        end = i;
        break;
      }
    }
    for(int i = start; i <= end; i++){
      char ch = s.charAt(i);
      ans += ch;
    }
    System.out.print(ans);
  }
}
    
    