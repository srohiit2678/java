import java.util.Scanner;
public class ReverseString{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;

do{
System.out.print("Enter the Number for Reverse : ");
String x = sc.next();
int count = x.length();	count--;
String r = "";
    
 while(count >= 0){
	 r = r + x.charAt(count);
	 count--;
 }
System.out.println("->The String after Reverse : "+ r);

	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}