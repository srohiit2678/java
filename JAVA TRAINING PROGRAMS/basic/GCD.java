import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
char ch;

do{
    System.out.print("Enter the first number :");
    int num1 = sc.nextInt();
    System.out.print("Enter the secound number :");
    int num2 = sc.nextInt();
    while(num1 != num2){
        if(num1>num2){  num1 -= num2; }
        else { num2 -= num1;   }
    }
    System.out.println("Gretest comman Factor is : " + num1);
    System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
    }
}
