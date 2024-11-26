import java.util.Scanner;
public class Swapping{
public static void main(String []args){
	char ch;
	Scanner sc = new Scanner(System.in);
do{
System.out.print("Enter the 1st Number : ");
int x = sc.nextInt();
System.out.print("Enter the 2nd Number : ");
int y = sc.nextInt();
System.out.println("---------values before swapping--------");

	System.out.println("1st Number is :" + x);
	System.out.println("2nd Number is :" + y);	
	
	x = x^y; // x*y; // x+y;
	y = x^y; // x/y; // x-y;
	x = x^y; // x/y; // x-y; 
	
System.out.println("---------values after swapping--------");

	System.out.println("1st Number is :" + x);
	System.out.println("2nd Number is :" + y);	

	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}