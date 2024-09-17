import java.math.*; // BigInteger pacakage
import java.util.Scanner;
// all java classes have a static method -> valueOf() 

public class BigInteger4 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number for Factorial : ");
String f = sc.next();
// for grater then long value we have to provide number in String formate to BigInteger constructor
BigInteger fact = new BigInteger(f); 

BigInteger s = BigInteger.ONE; //s = 1 now

BigInteger p = fact;
// compareTo() returns -1(less then) 0(equal) 1(grater then)
for(BigInteger i = BigInteger.ONE; fact.compareTo(i)>=0;i=i.add(BigInteger.ONE)){
s = s.multiply(i);
}
System.out.println("Factorial of "+p+" is "+s);
sc.close();
 }
}
/*

*/