import java.math.*; // BigInteger pacakage

// all java classes have a static method -> valueOf() 

public class BigInteger2{
public static void main(String[] args){

BigInteger s = BigInteger.valueOf(10);
BigInteger x = BigInteger.valueOf(20);

System.out.println(s);
System.out.println(x);


System.out.println(x.add(s));
System.out.println(x.subtract(s));
System.out.println(x.multiply(s));
System.out.println(x.divide(s));
System.out.println(x.mod(s));

 }
}
/*
BigInteger methods->
add()     -> +
subtract()-> -
multiply()-> *
divide()  -> /
mod()	  -> %
*/