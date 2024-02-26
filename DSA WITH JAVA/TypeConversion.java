/*
 -> Type conversion in java -> widening or impicit
    
     	conversion is possible if
	
	1. type compatible{
		
		int -> float  is possible 
		
		but
		
		int -> boolean  is not possible
	}
	
	2. destination type > source type{
			
		destination type shoud bigger size then the source type.
			
		byte -> short -> int -> float -> long -> double  
	}
*/

class TypeConversion{
	
public static void main(String args[]){

int a =25;
long b= a;	

System.out.println(b); //25

/*
long c =12l;
int d = c;  //not possible
System.out.println(d); // er: lossy conversion long to int
*/

/*
float h = g;	// 4 byte = 127    // but it gives error bcs long is an integer data type 
long i = h;	    // 8 byte = 127.0	// it does not contains floating values 

*/

byte e = 127;   // 1 byte = 127 
short f = e;	// 2 byte = 127 
int g = f;		// 4 byte = 127 
long h = g;	    // 8 byte = 127 
float i = h;	// 4 byte = 127 // here float can store long as well becous float store long in scientific notation
double j =i;	// 8 byte = 127.0 

System.out.println(i); // 127.0




/*

scientific notation ->

long long_variable = 123456789l;

float float_variable = long_variable;

System.out.println(float_variable); //op -> 1.23456792E8 || 1.2345679E8

*/
}
}

