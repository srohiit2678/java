import java.util.Scanner;
public class Table{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the Number for Table : ");
int x = sc.nextInt();
	for(int i=1;i<=10;i++){
	
		System.out.println(x+"  X "+i+" = " + (i*x));

	}
		System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}