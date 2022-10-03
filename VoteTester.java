import java.util.Scanner;

public class VoteTester {
    Scanner sc = new Scanner(System.in);

    void check(){
        System.out.println("Kindly Enter your Age: ");
        int age = sc.nextInt();
        if(age<1)
        {
            System.out.println("Enter Proper Age.");
        }
        else if(age<18)
        {
            System.out.println("He/She Cannot Vote.");
        }
        else{
            System.out.println("He/She Can Vote.");
        }
    }

    public static void main(String[] args) {
        VoteTester v = new VoteTester();
        v.check();
    }

}
