import java.util.Scanner;

public class TriangleValidation
{
    Scanner sc = new Scanner(System.in);

    void validate()
    {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a<1 || b<1 || c<1)
        {
            System.out.println("Enter Proper positive angles of the Triangle");
        }
        else if(a+b+c==180.0)
        {
            System.out.println("The Angles given are valid angles for a given Triangle.");
        }
        else{
            System.out.println("The Angles given are not valid angles for a given Triangle.");
        }
    }

    public static void main(String[] args) {
        TriangleValidation a = new TriangleValidation();
        a.validate();
    }
}
