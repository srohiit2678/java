import java.util.Scanner;
public class Prime{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;
do{
System.out.print("Enter the Number for Prime : ");
int x = sc.nextInt();
boolean p=true;	
	for(int i=2;i<=x/2+1;i++){
	if(x%i==0){ p =false; }
	    }
		if(p){
		System.out.println(x +" is Prime");
		}
		else {
		System.out.println(x +" is not Prime");
			
		}
		System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
sc.close();
}
}