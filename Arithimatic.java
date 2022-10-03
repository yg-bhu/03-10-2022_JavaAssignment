import java.util.Scanner;

public class Arithimatic {
    Scanner sc = new Scanner(System.in);
    int num1=0;
    int num2=0;
    public  void input(){
        num1=sc.nextInt();
        num2=sc.nextInt();
    }
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int rem(int a,int b){
        return a%b;
    }
    public static void main(String[] args) {
        Arithimatic a = new Arithimatic();
        System.out.println("Enter any two numbers :");
        a.input();
        System.out.println("Addition : "+a.add(a.num1, a.num2));
        System.out.println("Subtraction : "+a.sub(a.num1, a.num2));
        System.out.println("Multiplication : "+a.mul(a.num1, a.num2));
        System.out.println("Division : "+a.div(a.num1, a.num2));
        System.out.println("Modulus : "+a.rem(a.num1, a.num2));
    }
}
