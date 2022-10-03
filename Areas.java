import java.util.Scanner;

public class Areas {
    Scanner sc = new Scanner(System.in);
    double radius=0, sl=0,l=0,b=0;

    void input(){
        System.out.println("Enter the Radius of the Circle:");
        radius= sc.nextDouble();
        circle(radius);
        System.out.println("Enter the Length of the Square:");
        sl= sc.nextDouble();
        square(sl);
        System.out.println("Enter the Length and breath of the Circle");
        l= sc.nextDouble();
        b=sc.nextDouble();
        rectangle(l,b);
    }

    void circle(double a){
        System.out.println("Area: "+3.14*a*a);
    }
    void square(double a){
        System.out.println("Area: "+a*a);
    }
    void rectangle(double a,double b){
        System.out.println("Area: "+a*b);
    }
    public static void main(String[] args) {
            Areas a = new Areas();
            a.input();

    }

}
