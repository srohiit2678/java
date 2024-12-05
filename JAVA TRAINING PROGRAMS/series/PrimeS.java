import java.util.Scanner;
public class PrimeS{
 static boolean prime(int n){
	 boolean p = true;	
	for(int i=2;i<=n/2+1;i++){
	if(n%i==0){ p =false; }
	    }
		return p;
 }

public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the Number for Prime Series : ");
int x = sc.nextInt();
	for(int i = 1;i<= x;i++){
		if(prime(i)){ System.out.print(" "+i); }
		else { continue; }
	}
	System.out.printf("\n\n");
    System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}