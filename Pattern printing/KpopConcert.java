public class KpopConcert{
  public static void main(String[]args){
    for(int i=0;i<8;i++){
      for(int j=0;j<8;j++){
        int n=(i+j)%8;
        if(n<4)
          System.out.print("*");
        else 
          System.out.print(".");
      }
      System.out.println();
    }
  }
}