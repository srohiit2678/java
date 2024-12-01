import java.util.Scanner;
public class Palindrome{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
int r1=1,r2=0;
do{
System.out.print("Enter the Number for Palindrome : ");
int x = sc.nextInt();
int temp = x;
 while(x > 0){
	 r1 = x%10;
	 r2 = r2*10+r1;
	 x  = x/10;
 }
 if(r2 == temp){
System.out.println("the Number "+temp+" is Palindrome : "); 
}
else { System.out.println("the Number "+temp+" is not Palindrome : "); }
	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}