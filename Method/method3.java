import java.util.Scanner;
public class method3{
  public static void main(String[]args){
    double t = calcTax(20, 18000);
    System.out.printf("%.1f\n",t);
    calcYearlyTax();
  }
//  calculates tax depending on age and salary
  public static double calcTax(int age, int salary){
    if(age < 18 || salary < 10000){
      return 0.0;
    }
    else if(salary >= 10000 && salary <= 20000){
      return salary * 0.07;
    }
    else{
      return salary * 0.14;
    }
  }
//  calculates tax for 12 months (a year)
  public static void calcYearlyTax(){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    double totalTax = 0;
    for(int i = 1; i <= 12; i++){
      int salary =  sc.nextInt();
      double tax = calcTax(age, salary);
      if (tax == 0){
        System.out.println("Month" + i + " tax: 0");
      }
      else{
        System.out.println("Month" + i + " tax: " + tax);
      }
      totalTax += tax;
    }
    System.out.println("Total Yearly Tax: " + totalTax);
  }
}