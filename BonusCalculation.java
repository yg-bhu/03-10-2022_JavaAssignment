import java.util.Scanner;

public class BonusCalculation
{
    Scanner sc = new Scanner(System.in);
     void Calculate()
     {
         double BasicSalary = sc.nextDouble();
         double TA = BasicSalary*0.10;
         double DA = BasicSalary*0.15;
         double HRA = BasicSalary*0.20;
         double PF = BasicSalary*0.12;
         double Bonus = BasicSalary*0.10;
         if(BasicSalary<20000)
         {
             Bonus = BasicSalary*0.20;
             double gross = BasicSalary+TA+DA+HRA+Bonus-PF;
             System.out.println("The Gross Salary of the Employee is: "+gross);
         } else {
             double gross = BasicSalary+TA+DA+HRA+Bonus-PF;
             System.out.println("The Gross Salary of the Employee is: "+gross);
         }

     }

    public static void main(String[] args) {
        BonusCalculation a = new BonusCalculation();
        a.Calculate();
    }
}
