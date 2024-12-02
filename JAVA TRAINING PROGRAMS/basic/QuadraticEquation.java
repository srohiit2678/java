import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.print("Roots of Quadratic Equation (ax^2+bx+c=0) : ");
            System.out.print("Enter the a :");
            int a = sc.nextInt();
            System.out.print("Enter the b :");
            int b = sc.nextInt();
            System.out.print("Enter the c :");
            int c = sc.nextInt();
            double r1 = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
            double r2 = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
            System.out.println("Roots of Quadratic Equation is :"+r1 + " , "+r2);

            System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
            ch = sc.next().charAt(0);
      }while(ch=='N' ||  ch=='n');
      sc.close();
    }
}
