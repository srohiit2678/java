import java.util.Scanner;
public class Calculator{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the 1st Number : ");
int x = sc.nextInt();
System.out.print("Enter the 2nd Number : ");
int y = sc.nextInt();
System.out.print("------- Enter the opration on Numbers --------- : ");
String z = sc.next();
	switch(z)
	{
		case "+":
		System.out.println("Result of Numbers :" + (x+y));
		break;
		case "-":
		System.out.println("Result of Numbers :" + (x-y));
		break;
		case "*":
		System.out.println("Result of Numbers :" + (x*y));
		break;
		case "/":
		System.out.println("Result of Numbers :" + (x/y));
		break;
		default:
		System.out.println("Enter valid opration");
		break;
		}
		System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}