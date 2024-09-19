import java.util.Scanner;
public class Greatest{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the 1st Number : ");
int x = sc.nextInt();
System.out.print("Enter the 2nd Number : ");
int y = sc.nextInt();
System.out.print("Enter the 3rd Number : ");
int z = sc.nextInt();

	if(x > y && x > z){
		System.out.println("Greatest Number is :" + x);
	}
	else if(y > x && y > z){
		System.out.println("Greatest Number is :" + y);
	}
	else {
		System.out.println("Greatest Number is :" + z);
	}
	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}