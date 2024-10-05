import java.util.Scanner;
class Fact{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char ch;
do{	
System.out.print("Enter number for Factorial up to 20 : ");
int n = sc.nextInt();
System.out.println();

for(int i = 1; i<= n; i++){
long f = 1l;
for(int j =1;j<=i ;j++){
	f = f*j;
}
System.out.println("Fact. of "+i+" = "+f);
}
System.out.print("Enter your choice Y for continue : ");
 ch = sc.next().charAt(0);
}while(ch =='Y' || ch == 'y');

sc.close();
}
}

/*

*/