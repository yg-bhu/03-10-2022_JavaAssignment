import java.util.Scanner;

public class InsurancePolicy
{
    Scanner sc = new Scanner(System.in);
    void insuranceCheck()
    {
        System.out.println("Are you married: (yes/No)");
        String marriage = sc.nextLine();
        if(marriage.equalsIgnoreCase("yes"))
        {
            System.out.println("You are Insured.");
        }
        else
        {
            System.out.println("Enter your Gender: ");
            String gender = sc.nextLine();
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            if(gender.equalsIgnoreCase("male"))
            {
                if(age>30)
                {
                    System.out.println("you are Insured");
                }
                else {
                    System.out.println("you are not Insured");
                }
            }
            else {
                if(age>25)
                {
                    System.out.println("you are Insured");
                }
                else {
                    System.out.println("you are not Insured");
                }
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicy a = new InsurancePolicy();
        a.insuranceCheck();
    }
}
