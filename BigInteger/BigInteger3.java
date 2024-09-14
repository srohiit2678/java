import java.math.*; // BigInteger pacakage
import java.util.Scanner;
// all java classes have a static method -> valueOf() 

public class BigInteger3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number for Factorial : ");
int fact = sc.nextInt();
BigInteger s = BigInteger.ONE;// BigInteger.valueOf(1);
int i;
for(i=1;i<=fact;i++){
 s = s.multiply(BigInteger.valueOf(i));
}
System.out.println("Factorial of "+i-1+" is "+s);
 }
}
/*

*/