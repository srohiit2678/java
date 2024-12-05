import java.util.Scanner;
public class FibonacciS{

public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the Number upto 46 for Fibonacci Serier : ");
int x = sc.nextInt();
int a = 1, b = 0, c = 0; 
	for(int i = 1;i<= x;i++){
		 System.out.print(" "+c);
		 c = a+b;
		 a = b;
		 b = c;
	}
	System.out.printf("\n\n");
    System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();	
}

}