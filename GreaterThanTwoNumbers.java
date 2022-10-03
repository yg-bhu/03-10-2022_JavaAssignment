import java.util.Scanner;

public class GreaterThanTwoNumbers {
    Scanner sc = new Scanner(System.in);

    void check()
    {
        System.out.println("Enter the greater between two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a>b){
            System.out.println("The greatest Number is: "+a);
        }
        else {
            System.out.println("The greatest Number is: "+b);
        }
    }
    public static void main(String[] args) {
       GreaterThanTwoNumbers a = new GreaterThanTwoNumbers();
       a.check();
    }
}
