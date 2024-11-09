import java.util.Scanner;
public class Armstrong{

static int digitCount(int n){
	int count=0;
	while(n>0){
		n = n/10;
		count++;
	}
	return count;
}

static int countMultiply(int n,int count){
 int mult = 1;
	for(int i = 1; i <= count; i++){
		mult = mult*n;

	}
	return mult;
}

public static void main(String []args){
Scanner sc = new Scanner(System.in);
char ch;



do{
System.out.print("Enter the Number for Armstrong : ");
int x = sc.nextInt();
int temp = x;
 int r1=1,r2=0;
 while(x > 0){
	 r1 = x%10;
	 r2 = r2 + countMultiply(r1,digitCount(temp));
	 		System.out.println(r2);
	 x  = x/10;
 }
 
 if(r2 == temp){

 }
 else { System.out.println("The Number "+temp+" is not Armstrong "); }
	
	System.out.println("--------- Do You Want To Exit :(YES or NO)-----------");
	  ch = sc.next().charAt(0);
}while(ch=='N' ||  ch=='n');
	sc.close();
}
}