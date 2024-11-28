import java.util.Scanner;
public class LeapYear{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the Year : ");
int year = sc.nextInt();
System.out.println();
if(year%4 == 0 || (year%100 == 0) && (year%400 == 0)){
	System.out.println(year +" is a Leap Year");
}
else {
	System.out.println(year +" is not a Leap Year");	
}
	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}