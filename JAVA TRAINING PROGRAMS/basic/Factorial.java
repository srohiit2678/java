import java.util.Scanner;
public class Factorial{
	static int factorial(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the Number for Factorial : ");
int x = sc.nextInt();
int f=1;
f = factorial(x); // Recursion
  // --------- without Recursion ---------------
	for(int i=1;i<=x;i++){
	//f = f*i; // without Recursion
	}
		System.out.println("Factorial of "+ f);

		System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}