import java.util.Scanner;

public class DaysToMonthsConverter
{
    Scanner sc = new Scanner(System.in);
    void convert()
    {
        System.out.println("Enter the days to Convert: ");
        int days = sc.nextInt();
        System.out.println("The no.of months are: "+days/30);
        System.out.println("The no.of remaining days are: "+days%30);
    }

    public static void main(String[] args) {
        DaysToMonthsConverter a = new DaysToMonthsConverter();
        a.convert();
    }
}
